package model.skill;

import model.Role;

import java.util.HashSet;
import java.util.Set;

public class Fire extends Skill{
    public int damageUp;
    public Set<Role> fitRoles = new HashSet<Role>();
}
