package view;

import data.ImageData;
import model.skill.Skill;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import static game.Game.frame;
import static game.Game.monster;
import static game.Game.player;

/**
 * Time       : 2019/3/26 02:19
 * Author     : tangdaye
 * Description: 战斗面板
 */
public class BattlePanel extends JPanel {
    public BattlePanel() {
        init();
    }

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
        setBackground(new Color(0xECF0F1));
        // 画个正在战斗中
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("Arial", Font.BOLD, 40));
        g2.setColor(new Color(0xda4453));
        g2.drawString("Battle!", 280, 60);

        // 画两个小人
        g2.drawImage(ImageData.imgs.get(player.getName() + "-battle"), 70, 120, null);
        g2.drawImage(ImageData.imgs.get(monster.getId() + "-battle"), 470, 120, null);

        // 画一个小箭头
        g2.drawImage(ImageData.icons.get("arrow-icon"), 120, 365, null);
        // 画三个按钮
        g2.setFont(new Font("Arial", Font.PLAIN, 20));
        g2.setColor(Color.BLACK);
        g2.drawString("Attack", 160, 380);
        g2.drawString(skills.get(0).getName(), 160, 440);
        g2.drawString(skills.get(1).getName(), 160, 500);
    }
}
