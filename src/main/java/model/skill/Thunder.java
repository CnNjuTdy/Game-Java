package model.skill;

import model.role.Mage;

public class Thunder extends Skill {
    public Thunder() {
        super();
        this.fitRoles.add(Mage.class);
    }
}
