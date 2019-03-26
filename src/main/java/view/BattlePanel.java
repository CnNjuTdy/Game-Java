package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static game.Game.frame;

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
    }

    public void addListener() {
        frame.addKeyListener(k);
    }

    public void removeListener() {
        frame.removeKeyListener(k);
    }

    @Override
    protected void paintComponent(Graphics g) {
        setBackground(new Color(0xECF0F1));
    }
}
