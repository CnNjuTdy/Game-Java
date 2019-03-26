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

    private void drawImage(Graphics2D g2, int i, int j, String imgName) {
        if (!imgName.equals("wall")) {
            g2.drawImage(ImageData.imgs.get("ground"), j * 40, 10 + i * 40, null);
        }
        if (imgName.equals("player")) {
            if (this.player.getRoleName().equals("mage")){
                g2.drawImage(ImageData.imgs.get("mage"), j * 40, 10 + i * 40, null);
            } else if (this.player.getRoleName().equals("warrior")) {
                g2.drawImage(ImageData.imgs.get("warrior"), j * 40, 10 + i * 40, null);
            }
        } else
        g2.drawImage(ImageData.imgs.get(imgName), j * 40, 10 + i * 40, null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        setBackground(new Color(0xECF0F1));
        Graphics2D g2 = (Graphics2D) g;
        int[][] mapData = MapData.getMap(0);
        for (int i = 0; i < mapData.length; i++) {
            for (int j = 0; j < mapData[0].length; j++) {
                switch (mapData[i][j]) {
                    case 0:
                        this.drawImage(g2, i, j, "ground"); break;
                    case 1:
                        this.drawImage(g2, i, j, "wall"); break;
                    case 2:
                        this.drawImage(g2, i, j, "player"); break;
                    case 204:
                        this.drawImage(g2, i, j, "204"); break;
                    case 206:
                        this.drawImage(g2, i, j, "206"); break;
                    case 207:
                        this.drawImage(g2, i, j, "207"); break;
                    case 208:
                        this.drawImage(g2, i, j, "208"); break;
                    case 211:
                        this.drawImage(g2, i, j, "211"); break;
                }
            }
        }
    }
}
