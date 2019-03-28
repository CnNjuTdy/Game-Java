package model.weapon.weaponPart;

import model.weapon.Sword;
import model.weapon.Weapon;

public class SwordBlade extends WeaponPart {

    public SwordBlade(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getDisplayName() {
        return "剑刃 +30攻击力";
    }

    @Override
    public String getAttribute() {
        return weapon.getAttribute() + " +30攻击力";
    }

}
