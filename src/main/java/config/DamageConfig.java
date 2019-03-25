package config;

public class DamageConfig {
    //    伤害设置 单例模式
    private static DamageConfig ourInstance;

    private DamageConfig() {
    }

    public int sprint = 60;
    public int trample = 45;
    public int combat = 30;
    public int thunder = 50;
    public int wind = 35;
    public int fire = 20;

    public static synchronized DamageConfig getInstance() {
        if (ourInstance == null) {
            ourInstance = new DamageConfig();
        }
        return ourInstance;
    }
}
