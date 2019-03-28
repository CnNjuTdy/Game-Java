package view;

import controller.BattleController;
import data.ImageData;
import model.skill.Skill;
import pattern.Observer;
import pattern.Subject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import static game.Game.*;
import static java.awt.event.KeyEvent.*;

/**
 * Time       : 2019/3/26 02:19
 * Author     : tangdaye
 * Description: 战斗面板
 */
public class BattlePanel extends JPanel implements Observer {
    public BattlePanel() {
        init();
    }

    private int choose = 0;
    private BattleController controller = BattleController.getInstance();

    private KeyListener k;

    public void init() {
        setLayout(null);
        setBounds(230, 0, 730, 640);
    }

    public void addListener() {
        k = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case VK_UP: {
                        if (choose > 0) {
                            choose -= 1;
                        }
                        repaint();
                        break;
                    }
                    case VK_DOWN: {
                        if (choose < 2) {
                            choose += 1;
                        }
                        repaint();
                        break;
                    }
                    case VK_SPACE: {
                        controller.choose(choose);
                        choose = 0;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        frame.addKeyListener(k);
    }

    public void removeListener() {
        frame.removeKeyListener(k);
    }


    @Override
    protected void paintComponent(Graphics g) {
        List<Skill> skills = player.getSkills();
        setBackground(new Color(0xeeeeee));
        // 画个正在战斗中
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("宋体", Font.BOLD, 40));
        g2.setColor(Color.BLACK);
        g2.drawString("战斗中!", 280, 60);

        // 画两个小人
        g2.drawImage(ImageData.imgs.get(player.getPicName() + "-battle"), 70, 120, null);
        g2.drawImage(ImageData.imgs.get(monster.getId() + "-battle"), 470, 120, null);

        // 画一个小箭头
        g2.drawImage(ImageData.icons.get("arrow-icon"), 100, 365 + choose * 60, null);
        // 画三个按钮
        g2.setFont(new Font("宋体", Font.PLAIN, 20));
        g2.setColor(Color.BLACK);
        g2.drawString("攻击", 140, 380);
        g2.drawString(skills.get(0).getName(), 140, 440);
        g2.drawString(skills.get(1).getName(), 140, 500);
        // 画怪物的属性
        g2.drawString("生命: " + monster.getHp(), 500, 380);
        g2.drawString("攻击: " + monster.getAttack(), 500, 420);
        g2.drawString("防御: " + monster.getDefense(), 500, 460);
        g2.drawString("暴击: " + monster.getCritical(), 500, 500);

        //画战斗日志
        g2.setFont(new Font("宋体", Font.PLAIN, 13));
        int start = 120;
        for (int i = 0; i < log.getLog().size(); i++) {
            g2.drawString(log.getLog().get(i), 250, start + i * 20);
        }
    }

    @Override
    public void update(Subject s) {
        repaint();
    }
}
