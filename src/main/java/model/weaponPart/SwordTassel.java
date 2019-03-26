package model.weaponPart;

import model.weapon.Sword;

public class SwordTassel extends WeaponPart {
    public SwordTassel() {
        super();
        this.fitWeapons.add(Sword.class);
    }
}
//        _config_name = 'sword_tassel'
//        super().__init__([Sword])
//        return '剑穗'
