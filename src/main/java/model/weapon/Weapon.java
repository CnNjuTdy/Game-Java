package model.weapon;


import config.GameConfig;

public abstract class Weapon {
    protected GameConfig gameConfig = GameConfig.getInstance();

    public int getHp() {
        return Integer.valueOf(gameConfig.get(this.getClass().getName() + ".hp"));
    }

    public int getAttack() {
        return Integer.valueOf(gameConfig.get(this.getClass().getName() + ".attack"));
    }

    public int getCritical() {
        return Integer.valueOf(gameConfig.get(this.getClass().getName() + ".critical"));
    }

    public int getDefense() {
        return Integer.valueOf(gameConfig.get(this.getClass().getName() + ".defense"));
    }

    public int getPower() {
        return Integer.valueOf(gameConfig.get(this.getClass().getName() + ".power"));
    }

    public int getSpeed() {
        return Integer.valueOf(gameConfig.get(this.getClass().getName() + ".speed"));
    }

    public abstract String getName();

    public abstract String getDisplayName();

    public abstract String getAttribute();
}
