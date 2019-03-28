package controller;

import model.role.Monster;

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
            player.setLocation(x, y);
            // 开始战斗
            monster = new Monster(map.get(y, x), x, y); //新建一个怪

            mapPanel.setVisible(false); //地图图层隐去
            mapPanel.removeListener();//去掉地图图层的监听

            battlePanel.setVisible(true);//战斗图层开启
            battlePanel.addListener();//添加地图图层的监听

            monster.register(battlePanel); //怪物添加战斗面板观察者
            log.register(battlePanel);//日志添加战斗面板观察者
        }
    }

}
