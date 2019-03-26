package model.map;

import pattern.Subject;

/**
 * Time       : 2019/3/26 17:22
 * Author     : tangdaye
 * Description: 地图模型
 */
public abstract class Map extends Subject {
    public abstract int getWidth();

    public abstract int getHeight();

    public abstract int get(int i, int j);

}
