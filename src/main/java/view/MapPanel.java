package view;

import data.ImageData;
import model.PlayerModel;

import javax.swing.*;
import java.awt.*;

import data.MapData;

import static game.Game.*;

/**
 * Time       : 2019/3/25 22:00
 * Author     : tangdaye
 * Description: 地图图层
 */
public class MapPanel extends JPanel {
    private PlayerModel player;

    public void setPlayer(PlayerModel player) {
        this.player = player;
    }

    public MapPanel() {
        init();
    }

    public void init() {
        setLayout(null);
        setBounds(230, 0, 730, 640);
    }

    @Override
    protected void paintComponent(Graphics g) {
        setBackground(new Color(0xECF0F1));
        Graphics2D g2 = (Graphics2D) g;
        int[][] mapData = MapData.getMap(0);
        for (int i = 0; i < mapData.length; i++) {
            for (int j = 0; j < mapData[0].length; j++) {
                if (mapData[i][j] == 1) {
                    g2.drawImage(ImageData.imgs.get("1"), j * 40, 10 + i * 40, null);
                }
            }
        }
    }
}
