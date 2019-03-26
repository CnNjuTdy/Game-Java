package controller;

import static game.Game.*;

public class MapController {
    public static MapController instance;

    private MapController() {
    }

    public static MapController getInstance() {
        if (instance == null) {
            instance = new MapController();
        }
        return instance;
    }

    public void move(int deltaX, int deltaY) {
        int y = player.getY() + deltaY;
        int x = player.getX() + deltaX;
        if (x < 0 || y < 0) {
            return;
        }
        if (map.get(y, x) == 0) {
            player.setLocation(x, y);
        } else if (map.get(y, x) > 1) {
            // 开始战斗
            mapPanel.setVisible(false); //地图图层隐去
            mapPanel.removeListener();//去掉地图图层的监听

            battlePanel.setVisible(true);//战斗图层开启
            battlePanel.addListener();//添加地图图层的监听
        }
    }

}