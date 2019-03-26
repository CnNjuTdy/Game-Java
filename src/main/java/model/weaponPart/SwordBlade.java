package model.weaponPart;

import model.weapon.Sword;

public class SwordBlade extends WeaponPart {
    public SwordBlade() {
        super();
        this.fitWeapons.add(Sword.class);
    }
}
