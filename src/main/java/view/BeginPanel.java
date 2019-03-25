package view;

import data.ImageData;
import game.Game;
import model.PlayerModel;

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
    private JFrame frame;

    public BeginPanel(JFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        setLayout(null);
        setBackground(new Color(0xECF0F1));
        setSize(960, 640);
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
                        System.out.println("空格");
                        if (choose == 0) {
                        } else if (choose == 1) {
                        } else if (choose == 2) {
                            Game.getInstance().exitGame();
                        }
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
        g2.drawString("Exit game.Game", 430, 370);

        //绘制小箭头
        g2.drawImage(ImageData.icons.get("arrow-icon"), 370, 273 + choose * 40, null);
    }
}
