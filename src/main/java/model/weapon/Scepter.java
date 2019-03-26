package model.weapon;

import model.role.Mage;

public class Scepter extends Weapon {
    public Scepter() {
        super();
        this.fitRoles.add(Mage.class);
    }
}
//        _config_name = 'scepter'
