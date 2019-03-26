package model.skill;

import model.role.Warrior;

public class Combat extends Skill {
    public Combat() {
        super();
        this.fitRoles.add(Warrior.class);
    }
}
