package view;

import controller.MapController;
import data.ImageData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import pattern.Observer;
import pattern.Subject;

import static game.Game.*;
import static java.awt.event.KeyEvent.*;

/**
 * Time       : 2019/3/25 22:00
 * Author     : tangdaye
 * Description: 地图图层
 */
public class MapPanel extends JPanel implements Observer {
    private MapController controller = MapController.getInstance();
    private KeyListener k;

    public MapPanel() {
        init();
    }

    public void init() {
        setLayout(null);
        setBounds(230, 0, 730, 640);
        k = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case VK_UP: {
                        controller.move(0, -1);
                        break;
                    }
                    case VK_DOWN: {
                        controller.move(0, 1);
                        break;
                    }
                    case VK_LEFT: {
                        controller.move(-1, 0);
                        break;
                    }
                    case VK_RIGHT: {
                        controller.move(1, 0);
                        break;
                    }
                    case VK_SPACE: {
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
        Graphics2D g2 = (Graphics2D) g;
        // 画地图
        for (int i = 0; i < map.getHeight(); i++) {
            for (int j = 0; j < map.getWidth(); j++) {
                if (map.get(i, j) == 1) {
                    g2.drawImage(ImageData.imgs.get("wall"), j * 40, 10 + i * 40, null);
                }
            }
        }
        // 画玩家
        g2.drawImage(ImageData.imgs.get(player.getName()), player.getX() * 40, 10 + player.getY() * 40, null);
    }

    @Override
    public void update(Subject s) {
        repaint();
    }
}
