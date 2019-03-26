package model.weaponPart;


import java.util.Set;

public class WeaponPart {
//    _config_name = 'weapon_part'
    private Set<Class> fitWeapons;
    public WeaponPart(Set<Class> weaponSet) {
        this.fitWeapons = weaponSet;
    }

    public boolean isSuitableFor(Class wp) {
        return this.fitWeapons.contains(wp);
    }
}
