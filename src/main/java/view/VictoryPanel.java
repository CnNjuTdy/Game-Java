package view;


import javax.swing.*;
import java.awt.*;

/**
 * Time       : 2019/3/26 02:24
 * Author     : tangdaye
 * Description: 胜利面板
 */
public class VictoryPanel extends JPanel {
    public VictoryPanel() {
        init();
    }

    private void init() {
        setLayout(null);
        setBounds(0, 0, 960, 640);
    }

    @Override
    protected void paintComponent(Graphics g) {
        setBackground(new Color(0xECF0F1));
    }
}
