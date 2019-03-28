package model.skill;


public class Fire extends Skill {
    public Fire() {
        super();
    }

    @Override
    public String getName() {
        return "烈火：伤害"+getDamage();
    }
}
