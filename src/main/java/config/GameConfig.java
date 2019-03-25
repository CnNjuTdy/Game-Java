package config;

public class GameConfig {
//            游戏设置 单例模式
    private static GameConfig instance;

    private GameConfig() {}

    public int max_skill_length = 2;
    public int max_equipment_length = 3;
    public int role_max_level = 5;
    public int skill_max_level = 3;

    public static synchronized GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }
}
