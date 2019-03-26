package model.skill;

import model.role.Warrior;

public class Sprint extends Skill {
    public Sprint() {
        super();
        this.fitRoles.add(Warrior.class);
    }
}
