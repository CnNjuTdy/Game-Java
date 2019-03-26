package model.role;

import config.GameConfig;

public class Monster {
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

