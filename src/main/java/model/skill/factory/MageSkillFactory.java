package model.skill.factory;

import model.skill.Fire;
import model.skill.Skill;
import model.skill.Thunder;
import model.skill.Wind;

import java.util.ArrayList;
import java.util.List;

/**
 * Time       : 2019/3/27 01:54
 * Author     : tangdaye
 * Description: 法师的技能工厂
 */
public class MageSkillFactory implements SkillFactory {
    @Override
    public List<Skill> createSkills() {
        List<Skill> t = new ArrayList<>();
        t.add(new Fire());
        t.add(new Thunder());
        t.add(new Wind());
        return t;
    }
}
