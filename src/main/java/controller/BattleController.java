package controller;

import static game.Game.*;

public class BattleController {
    public static BattleController instance;

    private BattleController() {
    }

    public static BattleController getInstance() {
        if (instance == null) {
            instance = new BattleController();
        }
        return instance;
    }

}
