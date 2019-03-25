package model.skill;

import model.Role;

import java.util.HashSet;
import java.util.Set;

public class SkillList extends Skill{
    public int damageUp;
    public Set<Role> fitRoles = new HashSet<Role>();
}
//        def __init__(self):
//        super().__init__(game_config('max_skill_length'))
