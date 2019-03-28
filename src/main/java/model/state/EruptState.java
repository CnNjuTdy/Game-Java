package model.state;

/**
 * Time       : 2019/3/27 01:23
 * Author     : tangdaye
 * Description: 爆发状态
 */
public class EruptState implements State {
    @Override
    public String getName() {
        return "爆发状态";
    }

    @Override
    public int attack(int attack, boolean critical) {
        attack *= 2;
        return critical ? attack * 2 : attack;
    }

    @Override
    public int useSkill(int damage, int power) {
        damage *= 2;
        return damage * (1 + power / 100);
    }
}
