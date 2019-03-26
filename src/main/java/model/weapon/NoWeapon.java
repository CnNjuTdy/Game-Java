package model.weapon;

import model.role.Mage;
import model.role.Warrior;

public class NoWeapon extends Weapon {
    public NoWeapon() {
        super();
        this.fitRoles.add(Warrior.class);
        this.fitRoles.add(Mage.class);
    }
}
//        _config_name = 'no_weapon'
//        return '没有武器'
