package config;

import java.io.*;
import java.util.Properties;

public class GameConfig {
    private static GameConfig instance;
    Properties properties = new Properties();
    //    InputStream in = GameConfig.class.getClassLoader().getResourceAsStream("game.properties");
    FileInputStream in;
    private final static String resPath = System.getProperty("user.dir") + "/res";

    private GameConfig() {
        try {
            this.in = new FileInputStream(resPath + "/game.properties");
            properties.load(in);
            in.close();
        } catch (Exception e) {
            System.out.println("获取配置文件失败");
        }
    }

    public static synchronized GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }

    public String get(String configKey) {
        String[] temp = configKey.split("\\.");
        configKey = temp[temp.length - 2] + "." + temp[temp.length - 1];
        return properties.getProperty(configKey, "0");
    }
}
