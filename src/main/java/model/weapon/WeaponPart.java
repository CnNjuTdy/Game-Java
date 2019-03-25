package model.weapon;

import model.AttributeOwner;

import java.util.HashSet;
import java.util.Set;

public class WeaponPart extends AttributeOwner {
//    _config_name = 'weapon_part'
    private Set<Class> fitWeapons;
    public WeaponPart(Set<Class> weaponSet) {
        this.fitWeapons = weaponSet;
    }

    public boolean isSuitableFor(Class wp) {
        return this.fitWeapons.contains(wp);
    }
}
