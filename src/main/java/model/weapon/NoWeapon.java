package model.weapon;

import model.role.Mage;
import model.role.Warrior;

public class NoWeapon extends Weapon {
    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public int getAttack() {
        return 0;
    }

    @Override
    public int getCritical() {
        return 0;
    }

    @Override
    public int getDefense() {
        return 0;
    }

    @Override
    public int getPower() {
        return 0;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String getName() {
        return "No weapon";
    }
}
