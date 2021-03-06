package view;

import data.ImageData;
import data.MapData;
import model.map.DefaultMap;
import model.role.Mage;
import model.role.Warrior;
import model.skill.factory.MageSkillFactory;
import model.skill.factory.WarriorSkillFactory;
import model.weapon.factory.MageWeaponFactory;
import model.weapon.factory.WarriorWeaponFactory;

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
    private KeyListener k;

    public BeginPanel() {
        init();
    }

    private void init() {
        setLayout(null);
        setBounds(0, 0, 960, 640);
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
                        if (choose == 2) {
                            exitGame();
                        }
                        if (choose == 0) {
                            skillFactory = new MageSkillFactory();
                            weaponFactory = new MageWeaponFactory();
                            player = new Mage();
                        } else {
                            skillFactory = new WarriorSkillFactory();
                            weaponFactory = new WarriorWeaponFactory();
                            player = new Warrior();
                        }
                        removeListener();

                        beginPanel.setVisible(false);
                        mapPanel.setVisible(true);
                        mapPanel.addListener();
                        attributePanel.setVisible(true);

                        map = new DefaultMap(MapData.getMap(0));
                        map.register(mapPanel);

                        player.register(mapPanel);
                        player.register(attributePanel);
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

        //绘制标题
        g2.setFont(new Font("宋体", Font.BOLD, 50));
        g2.setColor(Color.BLACK);
        g2.drawString("Warcraft Demo", 300, 60);

        //绘制三个图标
        g2.drawImage(ImageData.icons.get("mage-icon"), 400, 273, null);
        g2.drawImage(ImageData.icons.get("warrior-icon"), 400, 313, null);
        g2.drawImage(ImageData.icons.get("exit-icon"), 400, 353, null);

        //绘制三个字符串
        g2.setFont(new Font("宋体", Font.PLAIN, 20));
        g2.drawString("选择法师", 430, 290);
        g2.drawString("选择战士", 430, 330);
        g2.drawString("离开游戏", 430, 370);

        //绘制小箭头
        g2.drawImage(ImageData.icons.get("arrow-icon"), 370, 273 + choose * 40, null);
    }
}
