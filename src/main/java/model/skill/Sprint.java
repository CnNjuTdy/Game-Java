package model.skill;


public class Sprint extends Skill {
    public Sprint() {
        super();
    }

    @Override
    public String getName() {
        return "冲刺：伤害" + getDamage();
    }
}
