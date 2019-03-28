package data;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * Time       : 2019/3/25 20:16
 * Author     : tangdaye
 * Description: 图形数据
 */
public class ImageData {
    public final static HashMap<String, BufferedImage> icons = new HashMap<>();
    public final static HashMap<String, BufferedImage> imgs = new HashMap<>();

    static {
        try {
            icons.put("exit-icon", ImageIO.read(ImageData.class.getResourceAsStream("/icon/exit-icon.png")));
            icons.put("mage-icon", ImageIO.read(ImageData.class.getResourceAsStream("/icon/mage-icon.png")));
            icons.put("warrior-icon", ImageIO.read(ImageData.class.getResourceAsStream("/icon/warrior-icon.png")));
            icons.put("arrow-icon", ImageIO.read(ImageData.class.getResourceAsStream("/icon/arrow-icon.png")));

            imgs.put("wall", ImageIO.read(ImageData.class.getResourceAsStream("/img/wall.png")));
            imgs.put("Mage", ImageIO.read(ImageData.class.getResourceAsStream("/img/mage.png")));
            imgs.put("Warrior", ImageIO.read(ImageData.class.getResourceAsStream("/img/warrior.png")));
            imgs.put("2", ImageIO.read(ImageData.class.getResourceAsStream("/img/2.png")));
            imgs.put("3", ImageIO.read(ImageData.class.getResourceAsStream("/img/3.png")));
            imgs.put("4", ImageIO.read(ImageData.class.getResourceAsStream("/img/4.png")));
            imgs.put("5", ImageIO.read(ImageData.class.getResourceAsStream("/img/5.png")));
            imgs.put("6", ImageIO.read(ImageData.class.getResourceAsStream("/img/6.png")));

            imgs.put("Mage-battle", ImageIO.read(ImageData.class.getResourceAsStream("/img/mage-battle.png")));
            imgs.put("Warrior-battle", ImageIO.read(ImageData.class.getResourceAsStream("/img/warrior-battle.png")));
            imgs.put("2-battle", ImageIO.read(ImageData.class.getResourceAsStream("/img/2-battle.png")));
            imgs.put("3-battle", ImageIO.read(ImageData.class.getResourceAsStream("/img/3-battle.png")));
            imgs.put("4-battle", ImageIO.read(ImageData.class.getResourceAsStream("/img/4-battle.png")));
            imgs.put("5-battle", ImageIO.read(ImageData.class.getResourceAsStream("/img/5-battle.png")));
            imgs.put("6-battle", ImageIO.read(ImageData.class.getResourceAsStream("/img/6-battle.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
