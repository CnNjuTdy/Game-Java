package model.skill;

import config.GameConfig;

import java.util.HashSet;
import java.util.Set;

abstract public class Skill {
    protected int damage;
    protected int maxLevel;
    protected int level;
    protected Set<Class> fitRoles;
    private static GameConfig gameConfig = GameConfig.getInstance();

    public Skill() {
        this.level = 0;
        this.fitRoles = new HashSet<>();
    }

    public boolean levelUp() {
        if (this.level < this.maxLevel) {
            this.level++;
            this.damage += Integer.valueOf(gameConfig.get(String.format("%s.%s",this.getClass().getName(), "damageLevelUp")));
            return true;
        }
        return false;
    }
}
