package model;

import model.state.DefaultState;
import model.state.State;




class Mage(Role):
        _config_name = 'mage'

        def __init__(self):
        super().__init__()

        def __str__(self):
        return '法师'


class Warrior(Role):
        _config_name = 'warrior'

        def __init__(self):
        super().__init__()

        def __str__(self):
        return '战士'


class NPC(AttributeOwner):
        _config_name = 'npc'

        def __init__(self):
        super().__init__()

        def __str__(self):
        return 'NPC'

        def level_up(self):
        t = level_up_config(self._config_name)
        for k, v in t:
        if k in self._attributes:
        self._attributes[k] += v
        else:
        self._attributes[k] = v
