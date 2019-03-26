package model.weapon.weaponPart;


import model.weapon.Weapon;

public abstract class WeaponPart extends Weapon {
    private Weapon weapon;

    public WeaponPart(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int getHp() {
        return weapon.getHp() + Integer.valueOf(gameConfig.get(this.getClass().getName() + ".hp"));
    }

    @Override
    public int getAttack() {
        return weapon.getAttack() + Integer.valueOf(gameConfig.get(this.getClass().getName() + ".attack"));
    }

    @Override
    public int getCritical() {
        return weapon.getCritical() + Integer.valueOf(gameConfig.get(this.getClass().getName() + ".critical"));
    }

    @Override
    public int getDefense() {
        return weapon.getDefense() + Integer.valueOf(gameConfig.get(this.getClass().getName() + ".defense"));
    }

    @Override
    public int getPower() {
        return weapon.getPower() + Integer.valueOf(gameConfig.get(this.getClass().getName() + ".power"));
    }

    @Override
    public int getSpeed() {
        return weapon.getSpeed() + Integer.valueOf(gameConfig.get(this.getClass().getName() + ".speed"));
    }

    @Override
    public String getName() {
        return weapon.getName();
    }

}
