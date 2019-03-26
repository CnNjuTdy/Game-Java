package model.skill;

import java.util.Set;

public class Skill {
    private int damage;
    private int maxLevel;
    private int level;
    private Set<Class> fitRoles;

    public Skill(Set<Class> roleSet) {
        this.level = 0;
        this.fitRoles = roleSet;
    }

    public boolean levelUp() {
        if (this.level < this.maxLevel) {
            this.level++;
            return true;
        }
        return false;
    }
}
