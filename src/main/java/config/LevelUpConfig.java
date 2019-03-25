package config;

public class LevelUpConfig {
//    升级设置 单例模式
    private static LevelUpConfig instance;

    public int sprint = 20;
    public int trample = 25;
    public int combat = 30;
    public int thunder = 20;
    public int wind = 30;
    public int fire = 40;

    warrior = {'hp': 50, 'attack': 10, 'critical': 5, 'defense': 20, 'power': 0, 'speed': 10};
    mage = {'hp': 50, 'attack': 5, 'critical': 2, 'defense': 10, 'power': 10, 'speed': 10};
    npc = {'hp': 10, 'attack': 3, 'critical': 5, 'defense': 5, 'power': 10, 'speed': 5};;

    private LevelUpConfig() {}

    public static synchronized LevelUpConfig getInstance() {
        if (instance == null) {
            instance = new LevelUpConfig();
        }
        return instance;
    }
}
