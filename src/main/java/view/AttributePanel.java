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
        Font titleFont = new Font("宋体", Font.BOLD, 20);
        Font labelFont = new Font("宋体", Font.BOLD, 15);
        Font contentFont = new Font("宋体", Font.PLAIN, 15);
        setBackground(new Color(0xeeeeee));
        Graphics2D g2 = (Graphics2D) g;
        g2.clearRect(0,0,1000,1000);
        g2.setFont(titleFont);
        g2.drawString("属性", 35, 40);
        g2.setFont(labelFont);
        g2.drawString("角色: ", 30, 80);
        g2.drawString("生命: ", 30, 110);
        g2.drawString("攻击: ", 30, 140);
        g2.drawString("暴击: ", 30, 170);
        g2.drawString("防御: ", 30, 200);
        g2.drawString("法强: ", 30, 230);
        g2.drawString("速度: ", 30, 260);
        g2.drawString("等级: ", 30, 290);
        g2.drawString("经验:", 30, 320);
        g2.drawString("状态:", 30, 350);
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
        g2.drawString("武器", 38, 400);
        g2.setFont(new Font("宋体", Font.PLAIN, 12));
        String t = player.getWeapon().getName() + " " + player.getWeapon().getAttribute();
        if (t.length() > 20) {
            t = t.substring(0, 20) + "...";
        }
        g2.drawString(t, 20, 440);
        g2.setFont(titleFont);
        g2.drawString("技能", 46, 490);
        g2.setFont(contentFont);
        g2.drawString("<#1> " + player.getSkills().get(0).getName(), 30, 530);
        g2.drawString("<#2> " + player.getSkills().get(1).getName(), 30, 570);

    }

    @Override
    public void update(Subject s) {
        repaint();
    }
}
