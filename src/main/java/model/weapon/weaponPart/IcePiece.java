package model.weapon.weaponPart;

import model.weapon.Weapon;

public class IcePiece extends WeaponPart {
    public IcePiece(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getDisplayName() {
        return "冰片 +20防御";
    }

    @Override
    public String getAttribute() {
        return weapon.getAttribute() + " +20防御";
    }

}
