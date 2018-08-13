package Persons;


import Items.Armor;
import Items.Weapon;

import java.util.Random;

public abstract class Player extends Person
{
    private Weapon weaponItem;
    private Armor armorItem;

    public Player(int hp, int basicArmor, int attack, int level, String name, Weapon weaponItem, Armor armorItem)
    {
        super(hp, basicArmor, attack, level, name);
        this.weaponItem = weaponItem;
        this.armorItem = armorItem;
    }

    public void attack(Person enemy)
    {
        enemy.getHurt(playerRandomAttack() + weaponItem.getAttack(), weaponItem.getArmorPenetration());
    }

    public int damageValue(int amount, int armorPenetration)
    {
        return (amount * (100 - (calcArmorPenetration(armorPenetration)))) / 100; // zwraca ilość obrażń uwzględniając wynik calcArmorPenetration
    }

    public int calcArmorPenetration(int armorPenetration) // Oblicza procent o jaki będą obniżone obrażenia po uwzględnieniu pól armor i armorPenetration
    {
        return (super.getArmor()+armorItem.getArmor() - (super.getArmor()+armorItem.getArmor() * armorPenetration) / 100); //oblicza o ile penetracja osłabi pancerz
    }
    public int getHp()
    {
        return super.getHp();
    }

    private int playerRandomAttack ()
    {
        return (int)(Math.random()*0.2*super.getAttack()+super.getAttack()*0.9);
    }

}
