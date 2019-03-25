package view;

import javax.swing.*;
import java.awt.*;

/**
 * Time       : 2019/3/26 02:19
 * Author     : tangdaye
 * Description: 战斗面板
 */
public class BattlePanel extends JPanel {
    public BattlePanel() {
        init();
    }

    public void init() {
        setLayout(null);
        setBounds(230, 0, 730, 640);
    }

    @Override
    protected void paintComponent(Graphics g) {
        setBackground(new Color(0xECF0F1));
    }
}
