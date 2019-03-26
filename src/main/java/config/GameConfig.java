package config;

import java.io.*;
import java.util.Properties;

public class GameConfig {
    Properties properties = new Properties();
//    InputStream in = GameConfig.class.getClassLoader().getResourceAsStream("game.properties");
    FileInputStream in;

    public GameConfig() {
        try {
            this.in = new FileInputStream("game.properties");
            properties.load(in);
            in.close();
        } catch (Exception e) {
            System.out.println("获取配置文件失败");
        }
    }

    public String get(String configKey) {
        return properties.getProperty(configKey);
    }
}
