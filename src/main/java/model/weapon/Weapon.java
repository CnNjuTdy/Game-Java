package model.weapon;

import model.AttributeOwner;

import java.util.ArrayList;
import java.util.Set;

public class Weapon extends AttributeOwner{
//        _config_name = 'weapon'
    private ArrayList<WeaponPart> weaponParts = new ArrayList<>();
    private Set<Class> fitRoles;
    public Weapon(Set<Class> roleSet) {
        this.weaponParts = new ArrayList<>();
        this.fitRoles = roleSet;
    }
    public boolean isSuitableFor(Class role) {
        return this.fitRoles.contains(role);
    }

    public ArrayList<WeaponPart> getAttribute() {
        return weaponParts;
//        def get_attribute(self, name):
//        t = 0
//        for weapon_part in self._weapon_parts:
//        t += weapon_part.get_attribute(name)
//        m = self._attributes.get(name)
//        return m + t if m is not None else t
    }

    public boolean addWeaponPart(WeaponPart wp) {
        if (wp.isSuitableFor(this.getClass())) {
            this.weaponParts.add(wp);
            return true;
        }
        return false;
    }
}
