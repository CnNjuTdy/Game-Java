package model.role;

import model.*;
import model.skill.Skill;
import model.state.DefaultState;
import model.state.State;
import model.weapon.Weapon;

import java.util.ArrayList;

public class Role extends AttributeOwner {
    //    _config_name = 'role'
    private Weapon weapon;
    private ArrayList<Equipment> equipments = new ArrayList<>();
    private ArrayList<Skill> skills = new ArrayList<>();
    private State state = new DefaultState();
    private int max_level = game_config('role_max_level');
    private int level = 1;
    private int exp = 0;

    public Role() {
        this.weapon = new NoWeapon();
        this.equipments = new EquipmentList();
        this.skills = new SkillList();
        this.state = new DefaultState();
        this.max_level = game_config('role_max_level');
        this.level = 1;
        this.exp = 0;
    }
}


    def __init__(self):
            super().__init__()
    self._weapon = NoWeapon()
    self._equipments = EquipmentList()
    self._skills = SkillList()
    self._state = DefaultState()
    self._max_level = game_config('role_max_level')
    self._level = 1
    self._exp = 0

    def get_attribute(self, name):
    attribute = self._attributes.get(name)
            if attribute is not None:
            return attribute + self._weapon.get_attribute(name) + self._equipments.get_attribute(name)
            return self._weapon.get_attribute(name) + self._equipments.get_attribute(name)

    def level_up(self):
            if self._level == self._max_level:
            return 'already full level'
    t = level_up_config(self._config_name)
        for k, v in t:
            if k in self._attributes:
    self._attributes[k] += v
        else:
    self._attributes[k] = v

    def get_weapon(self, weapon):
            if not weapon.is_suitable_weapon(type(self)):
            return 'not suitable'
            if not type(self._weapon) == NoWeapon:
            return 'already has weapon'
    self._weapon = weapon
        # 通知view
        return 'ok'

    def get_skill(self, skill):
            if not skill.is_suitable_weapon(self):
            return 'not suitable'
    t = self._skills.add(skill)
            if not t:
            return 'full skill'
            return 'ok'

    def get_weapon_part(self, weapon_part):
            self._weapon.add_weapon_part(weapon_part)

    def get_equipment(self, equipment):
    t = self._equipments.add(equipment)
            if t:
    print('装备成功')  # 通知view
        return t

    def __str__(self):
            return '职业'
}
