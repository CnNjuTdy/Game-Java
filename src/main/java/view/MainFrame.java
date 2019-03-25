package view;


import javax.swing.*;
import java.awt.*;

/**
 * Time       : 2019/3/25 14:45
 * Author     : tangdaye
 * Description: 最高层frame
 */
public class MainFrame extends JFrame {
    private BeginPanel beginPanel;
    private MapPanel mapPanel;

    public MainFrame() {
        init();
    }

    private void init() {
        setTitle("RPG Game");
        setSize(960, 640);
        setBackground(new Color(0xECF0F1));
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
