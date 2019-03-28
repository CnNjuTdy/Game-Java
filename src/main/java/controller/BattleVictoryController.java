package controller;

import static game.Game.*;

/**
 * Time       : 2019/3/28 17:20
 * Author     : tangdaye
 * Description: todo
 */
public class BattleVictoryController {
    public static BattleVictoryController instance;

    private BattleVictoryController() {
    }

    public static BattleVictoryController getInstance() {
        if (instance == null) {
            instance = new BattleVictoryController();
        }
        return instance;
    }

    public void backToGame() {
        weaponReward = null;
        levelUp = false;

        battleVictoryPanel.removeListener();
        battleVictoryPanel.setVisible(false);

        mapPanel.addListener();
        mapPanel.setVisible(true);
    }

    public void skillLevelUp(int index) {
        if (index == 2) {
            index = 0;
        }
        player.getSkills().get(index).levelUp();
        player.notifyObserver();
        backToGame();
    }
}
