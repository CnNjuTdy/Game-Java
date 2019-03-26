package model.map;

import data.MapData;
import pattern.Observer;
import pattern.Subject;

/**
 * Time       : 2019/3/26 17:22
 * Author     : tangdaye
 * Description: 地图模型
 */
public class DefaultMap extends Map {
    private int[][] mapData;

    public DefaultMap(int[][] mapData) {
        this.mapData = mapData;
    }


    public int getWidth() {
        return mapData[0].length;
    }

    public int getHeight() {
        return mapData.length;
    }

    public int get(int i, int j) {
        return mapData[i][j];
    }

    public static void main(String[] args) {
        DefaultMap map = new DefaultMap(MapData.getMap(0));
        System.out.println(map.get(14, 0));
    }
}
