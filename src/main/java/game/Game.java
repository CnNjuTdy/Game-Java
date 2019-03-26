package game;

import model.map.Map;
import model.role.Monster;
import model.role.Role;
import sun.applet.Main;
import view.*;

import javax.swing.*;

/**
 * Time       : 2019/3/25 18:26
 * Author     : tangdaye
 * Description: 程序入口
 */
public class Game {
    public static Role player;
    public Monster monster;
    public static Map map;
    public static MainFrame frame;
    public static BeginPanel beginPanel;
    public static AttributePanel attributePanel;
    public static MapPanel mapPanel;
    public static BattlePanel battlePanel;
    public static SelectPanel selectPanel;
    public static VictoryPanel victoryPanel;

    public static void startGame() {
        frame = new MainFrame();
        frame.setLayout(null);

        beginPanel = new BeginPanel();
        beginPanel.addListener();
        beginPanel.setVisible(true);

        attributePanel = new AttributePanel();
        attributePanel.setVisible(false);

        mapPanel = new MapPanel();
        mapPanel.setVisible(false);

        battlePanel = new BattlePanel();
        battlePanel.setVisible(false);

        selectPanel = new SelectPanel();
        selectPanel.setVisible(false);

        victoryPanel = new VictoryPanel();
        victoryPanel.setVisible(false);

        frame.add(beginPanel);
        frame.add(attributePanel);
        frame.add(mapPanel);
        frame.add(battlePanel);
        frame.add(selectPanel);
        frame.add(victoryPanel);
    }

    public static void exitGame() {
        System.exit(0);
    }

}
