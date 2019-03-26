package view;

import pattern.Observer;
import pattern.Subject;

import javax.swing.*;
import java.awt.*;

import static game.Game.*;

/**
 * Time       : 2019/3/26 02:19
 * Author     : tangdaye
 * Description: 属性面板
 */
public class AttributePanel extends JPanel implements Observer {

    public AttributePanel() {
        init();
    }

    private void init() {
        setLayout(null);
        setBounds(0, 0, 230, 640);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Font titleFont = new Font("Arial", Font.BOLD, 20);
        Font labelFont = new Font("Arial", Font.BOLD, 15);
        Font contentFont = new Font("Arial", Font.PLAIN, 15);
        setBackground(new Color(0xECF0F1));
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(titleFont);
        g2.drawString("Attributes", 35, 40);
        g2.setFont(labelFont);
        g2.drawString("Role: ", 30, 80);
        g2.drawString("HP: ", 30, 110);
        g2.drawString("Attack: ", 30, 140);
        g2.drawString("Critical: ", 30, 170);
        g2.drawString("Defense: ", 30, 200);
        g2.drawString("Power: ", 30, 230);
        g2.drawString("Speed: ", 30, 260);
        g2.drawString("Level: ", 30, 290);
        g2.drawString("Exp:", 30, 320);
        g2.drawString("State:", 30, 350);
        g2.setFont(contentFont);
        g2.drawString(player.getName(), 100, 80);
        g2.drawString(player.getHp() + "", 100, 110);
        g2.drawString(player.getAttack() + "", 100, 140);
        g2.drawString(player.getCritical() + "", 100, 170);
        g2.drawString(player.getDefense() + "", 100, 200);
        g2.drawString(player.getPower() + "", 100, 230);
        g2.drawString(player.getSpeed() + "", 100, 260);
        g2.drawString(player.getLevel() + "", 100, 290);
        g2.drawString(player.getExp() + "/100", 100, 320);
        g2.drawString(player.getState().getName(), 100, 350);

        g2.setFont(titleFont);
        g2.drawString("Weapon", 38, 400);
        g2.setFont(contentFont);
        g2.drawString(player.getWeapon().getName(), 30, 440);
        g2.setFont(titleFont);
        g2.drawString("Skill", 46, 490);
        g2.setFont(contentFont);
        g2.drawString("<#1> " + player.getSkills().get(0).getName(), 30, 530);
        g2.drawString("<#2> " + player.getSkills().get(1).getName(), 30, 570);

    }

    @Override
    public void update(Subject s) {
        repaint();
    }
}
