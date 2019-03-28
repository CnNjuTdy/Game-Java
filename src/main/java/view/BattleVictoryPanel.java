package view;

import controller.BattleVictoryController;
import data.ImageData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static game.Game.*;
import static java.awt.event.KeyEvent.*;

/**
 * Time       : 2019/3/27 16:18
 * Author     : tangdaye
 * Description: 战斗胜利
 */
public class BattleVictoryPanel extends JPanel {
    public BattleVictoryPanel() {
        init();
    }

    private KeyListener k;
    private int choose = 0;
    private BattleVictoryController controller = BattleVictoryController.getInstance();

    private void init() {
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
                if (levelUp) {
                    switch (e.getKeyCode()) {
                        case VK_UP: {
                            if (choose > 0) choose -= 1;
                            repaint();
                            break;
                        }
                        case VK_DOWN: {
                            if (choose < 2) choose += 1;
                            repaint();
                            break;
                        }
                        case VK_SPACE: {
                            controller.skillLevelUp(choose);
                            choose = 0;
                            break;
                        }
                        default:
                            break;

                    }
                } else {
                    if (e.getKeyCode() == VK_SPACE) {
                        controller.backToGame();
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
        setBackground(new Color(0xeeeeee));
        Graphics2D g2 = (Graphics2D) g;
        g2.clearRect(0,0,1000,1000);
        g2.setFont(new Font("宋体", Font.BOLD, 40));
        g2.drawString("获胜", 310, 110);
        //获得武器奖励
        g2.setFont(new Font("宋体", Font.PLAIN, 17));
        g2.drawString("获得武器：" + weaponReward.getDisplayName(), 60, 170);
        // 如果升级
        if (levelUp) {
            g2.drawString("恭喜升级！请选择技能升级.", 60, 200);
            g2.drawString("<#1> " + player.getSkills().get(0).getName() + player.getSkills().get(0).getLevelUp(), 120, 230);
            g2.drawString("<#2> " + player.getSkills().get(1).getName() + player.getSkills().get(1).getLevelUp(), 120, 260);
            g2.drawString("返回地图(默认升级1技能)", 120, 290);
            g2.drawImage(ImageData.icons.get("arrow-icon"), 60, 215 + choose * 30, null);
        } else {
            g2.drawString("返回地图", 120, 290);
            g2.drawImage(ImageData.icons.get("arrow-icon"), 60, 277, null);
        }
    }
}

