package model.skill;

import config.GameConfig;

import java.util.Set;

public class Skill {
    private int damage;
    private int maxLevel;
    private int level;
    private Set<Class> fitRoles;
    private static GameConfig gameConfig = GameConfig.getInstance();

    public Skill(Set<Class> roleSet) {
        this.level = 0;
        this.fitRoles = roleSet;
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
