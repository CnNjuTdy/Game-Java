package model.skill;


public class Combat extends Skill {
    public Combat() {
        super();
    }

    @Override
    public String getName() {
        return "决斗：伤害" + getDamage();
    }
}
