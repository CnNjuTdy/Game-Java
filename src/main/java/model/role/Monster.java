package model.role;

import config.GameConfig;
import pattern.Subject;

import static game.Game.*;

public class Monster extends Subject {
    private static GameConfig gameConfig = GameConfig.getInstance();
    private int id;
    private int hp;
    private int attack;
    private int defense;
    private int critical;
    private int exp;
    private int x;
    private int y;

    public Monster(int id, int x, int y) {
        this.id = id;
        int level = id - 2;
        this.hp = Integer.valueOf(gameConfig.get("Monster.hp")) + level * Integer.valueOf(gameConfig.get("Monster.hpLevelUp"));
        this.attack = Integer.valueOf(gameConfig.get("Monster.attack")) + level * Integer.valueOf(gameConfig.get("Monster.attackLevelUp"));
        this.defense = Integer.valueOf(gameConfig.get("Monster.defense")) + level * Integer.valueOf(gameConfig.get("Monster.defenseLevelUp"));
        this.critical = Integer.valueOf(gameConfig.get("Monster.critical")) + level * Integer.valueOf(gameConfig.get("Monster.criticalLevelUp"));
        this.exp = Integer.valueOf(gameConfig.get("Monster.exp"));
        this.x = x;
        this.y = y;
    }

    public boolean attack() {
        boolean critic = Math.random() > critical / 100.0;
        int damage = critic ? attack * 2 : attack;
        log.append("怪物对你造成了" + damage + "伤害");
        return player.beAttacked(damage);
    }

    public boolean beAttacked(int damage) {
        int t = (int) Math.round(damage * (1 - defense / 100.0));
        if (t >= hp) {
            //怪物死了
            return true;
        } else {
            this.hp -= t;
            log.append("怪物受到了" + t + "伤害");
            notifyObserver();
            return false;
        }
    }


    public int getId() {
        return id;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getCritical() {
        return critical;
    }

    public int getExp() {
        return exp;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}