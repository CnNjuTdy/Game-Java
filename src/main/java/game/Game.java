package game;

import view.MainFrame;

import javax.swing.*;

/**
 * Time       : 2019/3/25 18:26
 * Author     : tangdaye
 * Description: 程序入口
 */
public class Game {
    public static Game instance;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void startGame() {
        JFrame frame = new MainFrame();
    }

    public void exitGame() {
        System.exit(0);
    }

}
