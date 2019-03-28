package model.weapon;


public class Sword extends Weapon {
    @Override
    public String getName() {
        return "大剑";
    }

    @Override
    public String getDisplayName() {
        return "大剑 +40攻击力";
    }

    @Override
    public String getAttribute() {
        return "+40攻击力";
    }
}
