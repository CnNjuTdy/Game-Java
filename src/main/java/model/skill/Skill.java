package model.skill;

import config.GameConfig;


abstract public class Skill {
    protected int damage;
    protected int level;
    private static GameConfig gameConfig = GameConfig.getInstance();

    public Skill() {
        this.level = 0;
        this.damage = Integer.valueOf(gameConfig.get(String.format("%s.%s", this.getClass().getName(), "damage")));
    }

    public void levelUp() {
        this.level++;
        this.damage += Integer.valueOf(gameConfig.get(String.format("%s.%s", this.getClass().getName(), "damageLevelUp")));
    }

    public int getDamage() {
        return damage;
    }

    public abstract String getName();

    public String getLevelUp() {
        return " 升级额外造成" + Integer.valueOf(gameConfig.get(String.format("%s.%s", this.getClass().getName(), "damageLevelUp"))) + "伤害";
    }

}
