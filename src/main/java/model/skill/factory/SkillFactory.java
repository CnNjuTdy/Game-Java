package model.skill.factory;

import model.skill.Skill;

import java.util.List;

/**
 * Time       : 2019/3/27 01:47
 * Author     : tangdaye
 * Description: 技能工厂类
 */
public interface SkillFactory {
    List<Skill> createSkills();
}
