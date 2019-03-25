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
    public static HashMap<String, BufferedImage> icons = new HashMap<>();
    public static HashMap<String, BufferedImage> imgs = new HashMap<>();
    private static String resPath = System.getProperty("user.dir") + "/res";

    static {
        try {
            icons.put("exit-icon", ImageIO.read(new File(resPath + "/icon/exit-icon.png")));
            icons.put("mage-icon", ImageIO.read(new File(resPath + "/icon/mage-icon.png")));
            icons.put("warrior-icon", ImageIO.read(new File(resPath + "/icon/warrior-icon.png")));
            icons.put("arrow-icon", ImageIO.read(new File(resPath + "/icon/arrow-icon.png")));

            imgs.put("wall",ImageIO.read(new File(resPath+"/img/wall.png")));
            imgs.put("mage",ImageIO.read(new File(resPath+"/img/mage.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
