package model.weaponPart;

import model.weapon.MagicTome;

public class ImperfectSheet extends WeaponPart {
    public ImperfectSheet() {
        super();
        this.fitWeapons.add(MagicTome.class);
    }
}
