package model.skill;
import model.Role;

import java.util.HashSet;
import java.util.Set;

public class Skill {
    public int damage;
    public int maxLevel;
    public int level;
    public int damageUp;
    public Set<Role> fitRoles = new HashSet<Role>();

    public boolean levelUp() {
        if (this.level < this.maxLevel) {
            this.level++;
            this.damage += this.damageUp;
            return true;
        }
        return false;
    }

    public boolean isSuitableFor(Role role) {
        return this.fitRoles.contains(role);  //
    }
}
