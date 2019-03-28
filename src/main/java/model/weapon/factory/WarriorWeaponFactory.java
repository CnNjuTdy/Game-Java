package model.weapon.factory;

import model.weapon.Sword;
import model.weapon.Weapon;
import model.weapon.weaponPart.SwordBlade;
import model.weapon.weaponPart.SwordCase;
import model.weapon.weaponPart.SwordTassel;

/**
 * Time       : 2019/3/27 02:19
 * Author     : tangdaye
 * Description: todo
 */
public class WarriorWeaponFactory implements WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Weapon createWeaponPart(Weapon weapon) {
        double ran = Math.random();
        if (ran < 0.33) {
            return new SwordCase(weapon);
        } else if (ran < 0.66) {
            return new SwordBlade(weapon);
        }
        return new SwordTassel(weapon);
    }
}
