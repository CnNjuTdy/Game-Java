package view;

import data.ImageData;
import model.PlayerModel;

import static game.Game.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

/**
 * Time       : 2019/3/25 15:20
 * Author     : tangdaye
 * Description: 开始界面
 */
public class BeginPanel extends JPanel {
    private int choose = 0;

    public BeginPanel() {
        init();
    }

    private void init() {
        setLayout(null);
        setBounds(0, 0, 960, 640);
        frame.addKeyListener(new KeyListener() {
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
                        frame.removeKeyListener(this);
                        if (choose == 2) {
                            exitGame();
                        }
                        PlayerModel p;
                        if (choose == 0) {
                            p = new PlayerModel();
                            p.setRoleName("mage");
                        } else {
                            p = new PlayerModel();
                            p.setRoleName("warrior");
                        }
                        beginPanel.setVisible(false);
                        attributePanel.setVisible(true);
                        attributePanel.setPlayerModel(p);
                        mapPanel.setPlayer(p);
                        mapPanel.setVisible(true);
                        break;
                    }
                    default: {
                        break;
                    }

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        setBackground(new Color(0xECF0F1));
        Graphics2D g2 = (Graphics2D) g;

        //绘制标题
        g2.setFont(new Font("Arial", Font.BOLD, 50));
        g2.setColor(new Color(0x434A54));
        g2.drawString("Warcraft Demo", 300, 60);

        //绘制三个图标
        g2.drawImage(ImageData.icons.get("mage-icon"), 400, 273, null);
        g2.drawImage(ImageData.icons.get("warrior-icon"), 400, 313, null);
        g2.drawImage(ImageData.icons.get("exit-icon"), 400, 353, null);

        //绘制三个字符串
        g2.setFont(new Font("Arial", Font.PLAIN, 20));
        g2.drawString("Mage Start", 430, 290);
        g2.drawString("Warrior Start", 430, 330);
        g2.drawString("Exit Game", 430, 370);

        //绘制小箭头
        g2.drawImage(ImageData.icons.get("arrow-icon"), 370, 273 + choose * 40, null);
    }
}
