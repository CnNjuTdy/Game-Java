package view;

import model.PlayerModel;

import javax.swing.*;
import java.awt.*;

/**
 * Time       : 2019/3/26 02:19
 * Author     : tangdaye
 * Description: 属性面板
 */
public class AttributePanel extends JPanel {
    private PlayerModel playerModel = new PlayerModel();

    public void setPlayerModel(PlayerModel playerModel) {
        this.playerModel = playerModel;
    }

    public AttributePanel() {
        init();
    }

    private void init() {
        setLayout(null);
        setBounds(0, 0, 230, 640);
    }

    @Override
    protected void paintComponent(Graphics g) {
        setBackground(new Color(0xECF0F1));
        //repaint
        Graphics2D g2 = (Graphics2D) g;
    }
}
