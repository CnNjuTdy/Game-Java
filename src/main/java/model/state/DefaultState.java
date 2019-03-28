package model.state;

public class DefaultState implements State {
    @Override
    public String getName() {
        return "正常状态";
    }

    @Override
    public int attack(int attack, boolean critical) {
        return critical ? attack * 2 : attack;
    }

    @Override
    public int useSkill(int damage, int power) {
        return damage * (1 + power / 100);
    }
}
