package game;

import model.Log;
import model.map.Map;
import model.role.Monster;
import model.role.Role;
import model.skill.factory.SkillFactory;
import model.weapon.Weapon;
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
    public static Weapon weaponReward = null;
    public static Boolean levelUp = false;
    public static Boolean win = false;
    public static Monster monster;
    public static Map map;
    public static Log log;
    public static MainFrame frame;
    public static BeginPanel beginPanel;
    public static AttributePanel attributePanel;
    public static MapPanel mapPanel;
    public static BattlePanel battlePanel;
    public static BattleResultPanel battleResultPanel;
    public static BattleVictoryPanel battleVictoryPanel;

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

        battleResultPanel = new BattleResultPanel();
        frame.add(battleResultPanel);
        battleResultPanel.setVisible(false);

        battleVictoryPanel = new BattleVictoryPanel();
        frame.add(battleVictoryPanel);
        battleVictoryPanel.setVisible(false);

        log = new Log();
    }

    public static void exitGame() {
        System.exit(0);
    }

}
