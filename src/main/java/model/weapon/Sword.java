package model.weapon;

import model.role.Warrior;

public class Sword extends Weapon {
    public Sword() {
        super();
        this.fitRoles.add(Warrior.class);
    }
}
