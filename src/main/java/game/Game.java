package game;

import model.map.Map;
import model.role.Monster;
import model.role.Role;
import model.skill.factory.SkillFactory;
import model.weapon.factory.WeaponFactory;
import view.*;

/**
 * Time       : 2019/3/25 18:26
 * Author     : tangdaye
 * Description: 程序入口
 */
public class Game {
    public static Role player;
    public static SkillFactory skillFactory;
    public static WeaponFactory weaponFactory;
    public static Monster monster;
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
        frame.add(beginPanel);
        beginPanel.setVisible(true);

        attributePanel = new AttributePanel();
        frame.add(attributePanel);
        attributePanel.setVisible(false);

        mapPanel = new MapPanel();
        frame.add(mapPanel);
        mapPanel.setVisible(false);

        battlePanel = new BattlePanel();
        frame.add(battlePanel);
        battlePanel.setVisible(false);

        selectPanel = new SelectPanel();
        frame.add(selectPanel);
        selectPanel.setVisible(false);

        victoryPanel = new VictoryPanel();
        frame.add(victoryPanel);
        victoryPanel.setVisible(false);

    }

    public static void exitGame() {
        System.exit(0);
    }

}
