package model.skill;

import model.role.Mage;

public class Fire extends Skill {
    public Fire() {
        super();
        this.fitRoles.add(Mage.class);
    }
}
