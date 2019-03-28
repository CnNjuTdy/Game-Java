package model.weapon.weaponPart;

import model.weapon.Weapon;

public class SwordCase extends WeaponPart {
    public SwordCase(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getDisplayName() {
        return "剑格 +15暴击";
    }

    @Override
    public String getAttribute() {
        return weapon.getAttribute() + " +15暴击";
    }

//    @Override
//    public String getName() {
//        return "Sword Case";
//    }
}

