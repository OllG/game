package Persons.PlayerClasses;

import Persons.Player;
import Items.Armor;
import Items.Weapon;

public class Tank extends Player
{
    private static final int hp = 2000;
    private static final int basicArmor = 10;
    private static final int attack = 100;

    public Tank(Weapon weapon, Armor armor)
    {
        super(hp, basicArmor, attack, weapon, armor);
    }

}
