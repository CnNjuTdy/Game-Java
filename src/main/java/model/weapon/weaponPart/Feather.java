package model.weapon.weaponPart;

import model.weapon.Weapon;

public class Feather extends WeaponPart {

    public Feather(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getDisplayName() {
        return "羽毛 +20法强";
    }

    @Override
    public String getAttribute() {
        return weapon.getAttribute() + " +20法强";
    }

}
