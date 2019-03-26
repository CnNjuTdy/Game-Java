package model.weapon;

import model.role.Mage;

public class MagicTome extends Weapon {
    public MagicTome() {
        super();
        this.fitRoles.add(Mage.class);
    }
}
//        _config_name = 'magic_tome'
