package model.map;

import pattern.Subject;

/**
 * Time       : 2019/3/26 17:22
 * Author     : tangdaye
 * Description: 地图模型
 */
public interface Map extends Subject {
    public int getWidth();

    public int getHeight();

    public int get(int i, int j);

}
