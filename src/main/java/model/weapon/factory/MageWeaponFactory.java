package model.weapon.factory;

import model.weapon.MagicTome;
import model.weapon.Weapon;
import model.weapon.weaponPart.Feather;
import model.weapon.weaponPart.IcePiece;

/**
 * Time       : 2019/3/27 02:19
 * Author     : tangdaye
 * Description: todo
 */
public class MageWeaponFactory implements WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new MagicTome();
    }

    @Override
    public Weapon createWeaponPart(Weapon weapon) {
        double ran = Math.random();
        return ran > 0.5 ? new Feather(weapon) : new IcePiece(weapon);
    }
}
