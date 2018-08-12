package Persons.Enemies;

import Items.Armor;
import Items.Armors.EmptyArmor;
import Items.Weapon;
import Items.Weapons.GoblinSword;
import Persons.HumanoidEnemy;

public class Goblin extends HumanoidEnemy
{
    private static final int HP = 500;
    private static final int ARMOR = 2;
    private static final int ATTACK = 100;
    //private static  final int ARMOR_PENETRATION = 5;  to tylko nonhumanoid będą miały
    private GoblinSword weapon;
    private Armor ARMORITEM;


    public Goblin()
    {
        super(randomGoblinHealth(), ARMOR, ATTACK, "Goblin", randomGoblinWeapon(), randomGoblinArmor());
    }

    private static Weapon randomGoblinWeapon ()
    {
        return new GoblinSword();
    }

    private static Armor randomGoblinArmor()
    {
        return new EmptyArmor();
    }

    private static int randomGoblinHealth ()
    {
        return (int) (HP*0.9 + HP*(Math.random())*0.2);
    }

}
