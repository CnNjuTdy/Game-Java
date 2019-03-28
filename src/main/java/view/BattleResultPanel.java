package view;

import data.ImageData;
import game.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static game.Game.*;
import static java.awt.event.KeyEvent.VK_SPACE;

/**
 * Time       : 2019/3/27 16:19
 * Author     : tangdaye
 * Description: todo
 */
public class BattleResultPanel extends JPanel {
    public BattleResultPanel() {
        init();
    }

    private void init() {
        setLayout(null);
        setBounds(0, 0, 960, 640);
    }

    public void addListener() {
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == VK_SPACE) {
                    Game.exitGame();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        setBackground(new Color(0x434a54));
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("宋体", Font.BOLD, 50));
        g2.setColor(new Color(0xeeeeee));
        if (!win) {
            g2.drawString("你死了", 410, 200);
        } else {
            g2.drawString("胜利", 415, 200);
        }
        g2.setFont(new Font("宋体", Font.PLAIN, 20));
        g2.drawString("退出游戏", 470, 350);
        g2.drawImage(ImageData.icons.get("arrow-icon"), 410, 333, null);
    }
}
