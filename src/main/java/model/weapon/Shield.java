package model.weapon;

import model.role.Warrior;

public class Shield extends Weapon {
    public Shield() {
        super();
        this.fitRoles.add(Warrior.class);
    }
}
