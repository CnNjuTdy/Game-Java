package model.skill;

import model.role.Mage;

public class Wind extends Skill {
    public Wind() {
        super();
        this.fitRoles.add(Mage.class);
    }
}
