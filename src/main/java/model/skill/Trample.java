package model.skill;

import model.role.Warrior;

public class Trample extends Skill {
    public Trample() {
        super();
        this.fitRoles.add(Warrior.class);
    }
}
