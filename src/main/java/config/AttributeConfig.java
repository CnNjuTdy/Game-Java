package config;

public class AttributeConfig {
//        属性设置 单例模式
    _instance_lock = threading.Lock();
    private static AttributeConfig ourInstance;

//            角色属性
            mage = {'hp': 70, 'attack': 20, 'critical': 0, 'defense': 30, 'power': 10, 'speed': 100}
        warrior = {'hp': 100, 'attack': 40, 'critical': 20, 'defense': 40, 'power': 0, 'speed': 80}
                npc = {'hp': 100, 'attack': 10, 'critical': 10, 'defense': 10, 'power': 20, 'speed': 90}

                # 装备属性
                vitality_booster = {'hp': 200}
                attack_ring = {'attack': 60}
                critical_ring = {'critical': 30}
                armor = {'defense': 60}
                kaya = {'power': 50}
                power_treads = {'speed': 35, 'power': 5, 'critical': 5, 'attack': 20}
                crimson_guard = {'hp': 160, 'defense': 40}
                crystals = {'attack': 40, 'critical': 15}

                # 武器属性
                shield = {'defense': 50}
                sword = {'attack': 40}
                magic_tome = {'hp': 200}
                scepter = {'power': 40}

                # 武器配件
                vitality_shield = {'hp': 80}
                xuanwu_shield = {'defense': 30}
                sword_case = {'critical': 15}
                sword_tassel = {'speed': 70}
                feather = {'power': 20}
                ice_piece = {'defense': 20}
                imperfect_sheet = {'power': 15}
                cover = {'hp': 100}

@classmethod
    def instance(cls):
            with AttributeConfig._instance_lock:
            if not hasattr(AttributeConfig, "_instance"):
            AttributeConfig._instance = AttributeConfig()
            return AttributeConfig._instance
}

