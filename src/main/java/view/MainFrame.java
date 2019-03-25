package view;


import javax.swing.*;

/**
 * Time       : 2019/3/25 14:45
 * Author     : tangdaye
 * Description: 最高层frame
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        init();
    }

    private void init() {
        setTitle("RPG game.Game");
        setSize(960, 640);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel beginPanel = new BeginPanel(this);

        add(beginPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new MainFrame();
    }


}
