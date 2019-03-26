package model.role;

import config.GameConfig;
import model.*;
import model.equipment.Equipment;
import model.equipment.EquipmentList;
import model.skill.Skill;
import model.skill.SkillList;
import model.state.DefaultState;
import model.state.State;
import model.weapon.NoWeapon;
import model.weapon.Weapon;

import java.util.ArrayList;

abstract class Role {
    //    _config_name = 'role'
    protected Weapon weapon;
    protected ArrayList<Equipment> equipments;
    protected ArrayList<Skill> skills;
    protected State state;
    protected int maxLevel;  // game_config('role_max_level');
    protected int level;
    protected int exp;
    protected static GameConfig gameConfig = GameConfig.getInstance();

    private Integer hp;
    private Integer attack;
    private Integer critical;
    private Integer defense;
    private Integer power;
    private Integer speed;

    Role() {
//        this.weapon = new NoWeapon();
        this.equipments = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.state = new DefaultState();
        this.maxLevel = Integer.valueOf(gameConfig.get("Role.maxLevel"));
        this.level = 1;
        this.exp = 0;

        String className = this.getClass().getName();
        this.hp = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "hpLevelUp")));
        this.attack = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "attackLevelUp")));
        this.critical = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "criticalLevelUp")));
        this.defense = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "defenseLevelUp")));
        this.power = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "powerLevelUp")));
        this.speed = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "speedLevelUp")));
    }

    public boolean levelUp() {
        String className = this.getClass().getName();
        if (this.level < this.maxLevel) {
            this.level++;
            this.hp += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "hpLevelUp")));
            this.attack += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "attackLevelUp")));
            this.critical += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "criticalLevelUp")));
            this.defense += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "defenseLevelUp")));
            this.power += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "powerLevelUp")));
            this.speed += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "speedLevelUp")));
            return true;
        }
        return false;
    }
}


//    def get_weapon(self, weapon):
//            if not weapon.is_suitable_weapon(type(self)):
//            return 'not suitable'
//            if not type(self._weapon) == NoWeapon:
//            return 'already has weapon'
//    self._weapon = weapon
//        # 通知view
//        return 'ok'
//
//    def get_skill(self, skill):
//            if not skill.is_suitable_weapon(self):
//            return 'not suitable'
//    t = self._skills.add(skill)
//            if not t:
//            return 'full skill'
//            return 'ok'
//
//    def get_weapon_part(self, weapon_part):
//            self._weapon.add_weapon_part(weapon_part)
//
//    def get_equipment(self, equipment):
//    t = self._equipments.add(equipment)
//            if t:
//    print('装备成功')  # 通知view
//        return t
//
//    def __str__(self):
//            return '职业'
