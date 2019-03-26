package model.weaponPart;

import model.weapon.MagicTome;

public class Cover extends WeaponPart {
    public Cover() {
        super();
        this.fitWeapons.add(MagicTome.class);
    }
}
