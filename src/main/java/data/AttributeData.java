package data;

import java.util.HashMap;

/**
 * Time       : 2019/3/26 15:59
 * Author     : tangdaye
 * Description: 属性数据
 */
public class AttributeData {
    public final static HashMap<String, HashMap<String, Integer>> attrs = new HashMap<>();
    private final static HashMap<String, Integer> mageAttrs = new HashMap<>();
    private final static HashMap<String, Integer> warriorAttrs = new HashMap<>();

    static {
        mageAttrs.put("hp", 70);
        mageAttrs.put("attack", 20);
        mageAttrs.put("critical", 0);
        mageAttrs.put("defense", 30);
        mageAttrs.put("power", 10);
        mageAttrs.put("speed", 100);

        warriorAttrs.put("hp", 100);
        warriorAttrs.put("attack", 40);
        warriorAttrs.put("critical", 20);
        warriorAttrs.put("defense", 40);
        warriorAttrs.put("power", 0);
        warriorAttrs.put("speed", 80);

        attrs.put("mage", mageAttrs);
        attrs.put("warrior", warriorAttrs);
//        mage = {'hp': 70, 'attack': 20, 'critical': 0, 'defense': 30, 'power': 10, 'speed': 100}
//        warrior = {'hp': 100, 'attack': 40, 'critical': 20, 'defense': 40, 'power': 0, 'speed': 80}
    }
}
