package model.role;

import config.GameConfig;
import model.skill.Skill;
import model.state.DefaultState;
import model.state.EruptState;
import model.state.State;
import model.weapon.NoWeapon;
import model.weapon.Weapon;
import pattern.Subject;

import static game.Game.*;

import java.util.List;

public abstract class Role extends Subject {
    protected Weapon weapon;
    private List<Skill> skills;
    private State state;
    private State defaultState = new DefaultState();
    private State eruptState = new EruptState();
    private static GameConfig gameConfig = GameConfig.getInstance();

    private String name;

    private int level;
    private int exp;

    private int hp;
    private int attack;
    private int critical;
    private int defense;
    private int power;
    private int speed;

    private int x, y;

    Role() {
        this.weapon = new NoWeapon();
        this.skills = skillFactory.createSkills();
        this.level = 1;
        this.exp = 0;

        String className = this.getClass().getName();
        this.hp = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "hp")));
        this.attack = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "attack")));
        this.critical = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "critical")));
        this.defense = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "defense")));
        this.power = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "power")));
        this.speed = Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "speed")));

        this.state = hp < 30 ? eruptState : defaultState;
    }

    protected void levelUp() {
        String className = this.getClass().getName();
        this.level++;
        this.hp += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "hpLevelUp")));
        this.attack += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "attackLevelUp")));
        this.critical += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "criticalLevelUp")));
        this.defense += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "defenseLevelUp")));
        this.power += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "powerLevelUp")));
        this.speed += Integer.valueOf(gameConfig.get(String.format("%s.%s", className, "speedLevelUp")));
    }

    public boolean addExp(int expAdd) {
        exp += expAdd;
        if (exp > 100) {
            exp -= 100;
            this.levelUp();
            notifyObserver();
            return true;
        }
        notifyObserver();
        return false;
    }

    public boolean attack() {
        boolean critic = Math.random() < critical / 100.0;
        int damage = state.attack(attack, critic);
        if (critic) {
            log.append("玩家使用了普通攻击，造成了暴击伤害：" + damage);
        } else {
            log.append("玩家使用了普通攻击，造成了伤害：" + damage);
        }
        return monster.beAttacked(damage);
    }

    public boolean useSkill(int index) {
        int damage = state.useSkill(skills.get(index).getDamage(), power);
        log.append("玩家使用了技能" + skills.get(index).getName() + "，造成了伤害：" + damage);
        return monster.beAttacked(damage);
    }

    public boolean beAttacked(int damage) {
        int t = (int) Math.round(damage * (1 - defense / 100.0));
        if (t >= hp) {
            //玩家死了
            return true;
        } else {
            this.hp -= t;
            if (this.hp < 30) {
                this.state = eruptState;
            }
            log.append("玩家受到了" + t + "伤害");
            notifyObserver();
            return false;
        }
    }

    public int getHp() {
        return this.hp + weapon.getHp();
    }

    public int getAttack() {
        return this.attack + weapon.getAttack();
    }

    public int getLevel() {
        return this.level;
    }

    public int getExp() {
        return this.exp;
    }

    public int getCritical() {
        return this.critical + weapon.getCritical();
    }

    public int getDefense() {
        return this.defense + weapon.getDefense();
    }

    public int getPower() {
        return this.power + weapon.getPower();
    }

    public int getSpeed() {
        return this.speed + weapon.getSpeed();
    }

    public List<Skill> getSkills() {
        return this.skills;
    }

    public State getState() {
        return this.state;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setLocation(int x, int y) {
        if (x == this.x && y == this.y) {
            return;
        }
        this.x = x;
        this.y = y;
        notifyObserver();
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        notifyObserver();
    }

    public abstract String getPicName();

}