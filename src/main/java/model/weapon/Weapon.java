package model.weapon;

import model.weaponPart.WeaponPart;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

abstract public class Weapon {
//        _config_name = 'weapon'
    protected ArrayList<WeaponPart> weaponParts;
    protected Set<Class> fitRoles;
    public Weapon() {
        this.weaponParts = new ArrayList<>();
        this.fitRoles = new HashSet<>();
    }
    public boolean isSuitableFor(Class role) {
        return this.fitRoles.contains(role);
    }
    public boolean isSuitableFor(Role role) {
        return this.fitRoles.contains(role.getClass());
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

    public boolean addWeaponPart(WeaponPart weaponPart) {
        if (weaponPart.isSuitableFor(this)) {
            this.weaponParts.add(weaponPart);
            return true;
        }
        return false;
    }
}
