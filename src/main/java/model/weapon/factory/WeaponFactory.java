package model.weapon.factory;

import model.weapon.Weapon;

/**
 * Time       : 2019/3/27 02:18
 * Author     : tangdaye
 * Description: 武器工厂
 */
public interface WeaponFactory {
    Weapon createWeapon();

    Weapon createWeaponPart(Weapon weapon);
}
