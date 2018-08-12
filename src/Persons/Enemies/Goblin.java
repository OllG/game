package Persons.Enemies;

import Items.Armor;
import Items.Weapon;
import Persons.HumanoidEnemy;

public class Goblin extends HumanoidEnemy
{
    private static final int HP = 500;
    private static final int ARMOR = 2;
    private static final int ATTACK = 100;
    //private static  final int ARMOR_PENETRATION = 5;  to tylko nonhumanoid będą miały
    //private Weapon WEAPONITEM;
    //private Armor ARMORITEM;


    public Goblin( Weapon weapon, Armor armor)
    {
        super(HP, ARMOR, ATTACK, weapon, armor);
    }

}
