package model.skill.factory;

import model.skill.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Time       : 2019/3/27 01:54
 * Author     : tangdaye
 * Description: todo
 */
public class WarriorSkillFactory implements SkillFactory {
    @Override
    public List<Skill> createSkills() {
        List<Skill> t = new ArrayList<>();
        t.add(new Combat());
        t.add(new Sprint());
        return t;
    }
}
