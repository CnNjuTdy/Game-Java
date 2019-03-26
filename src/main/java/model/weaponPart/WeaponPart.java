package model.weaponPart;


import model.weapon.Weapon;

import java.util.HashSet;
import java.util.Set;

abstract public class WeaponPart {
//    _config_name = 'weapon_part'
    protected Set<Class> fitWeapons;
    public WeaponPart() {
        this.fitWeapons = new HashSet<>();
    }

    public boolean isSuitableFor(Class wp) {
        return this.fitWeapons.contains(wp);
    }
    public boolean isSuitableFor(Weapon wp) {
        return this.fitWeapons.contains(wp.getClass());
    }
}
