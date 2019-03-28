package model.skill;


public class Thunder extends Skill {
    public Thunder() {
        super();
    }

    @Override
    public String getName() {
        return "雷电：伤害" + getDamage();
    }
}
