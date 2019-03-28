package model.weapon.weaponPart;

import model.weapon.Weapon;

public class SwordTassel extends WeaponPart {
    public SwordTassel(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getDisplayName() {
        return "剑穗 +70速度";
    }

    @Override
    public String getAttribute() {
        return weapon.getAttribute() + " +70速度";
    }
}
