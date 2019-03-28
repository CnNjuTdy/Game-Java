package controller;

import model.weapon.NoWeapon;

import static game.Game.*;

public class BattleController {
    public static BattleController instance;

    private BattleController() {
    }

    public static BattleController getInstance() {
        if (instance == null) {
            instance = new BattleController();
        }
        return instance;
    }

    public void choose(int index) {
        boolean monsterIsDead = false;
        if (index == 0) {
            //普通攻击
            monsterIsDead = player.attack();
        } else if (index == 1) {
            //第一个技能
            monsterIsDead = player.useSkill(0);
        } else if (index == 2) {
            //第二个技能
            monsterIsDead = player.useSkill(1);
        }
        if (monsterIsDead) {
            if (monster.getId() == 6) {
                //获胜
                battlePanel.removeListener(); //去掉战斗面板的监听
                battlePanel.setVisible(false); //战斗面板不可见
                attributePanel.setVisible(false); //属性面板不可见
                win = true;
                battleResultPanel.setVisible(true); //战斗失败面板可见
                battleResultPanel.addListener(); //加上战斗失败面板的监听
                return;
            }
            //怪死了
            //第一步 获得经验(升级)
            levelUp = player.addExp(monster.getExp());
            //第二步，掉落装备
            if (player.getWeapon() instanceof NoWeapon) {
                weaponReward = weaponFactory.createWeapon();
            } else {
                weaponReward = weaponFactory.createWeaponPart(player.getWeapon());
            }
            player.setWeapon(weaponReward);
            // 第三步修改地图
            map.set(monster.getY(), monster.getX(), 0);

            //还原一些值
            monster = null;
            log.empty();

            battlePanel.removeListener(); //去掉战斗面板的监听
            battlePanel.setVisible(false); //战斗面板不可见

            battleVictoryPanel.setVisible(true); //战斗成功面板可见
            battleVictoryPanel.addListener();//加上战斗成功面板监听
            return;
        }
        boolean playerIsDead = monster.attack();
        if (playerIsDead) {
            battlePanel.removeListener(); //去掉战斗面板的监听
            battlePanel.setVisible(false); //战斗面板不可见
            attributePanel.setVisible(false); //属性面板不可见
            win = false;
            battleResultPanel.setVisible(true); //战斗失败面板可见
            battleResultPanel.addListener(); //加上战斗失败面板的监听
            return;
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }
}
