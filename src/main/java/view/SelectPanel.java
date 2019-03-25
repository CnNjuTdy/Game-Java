package view;

import javax.swing.*;
import java.awt.*;

/**
 * Time       : 2019/3/26 02:20
 * Author     : tangdaye
 * Description: 选择面板
 */
public class SelectPanel extends JPanel {
    public SelectPanel() {
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
