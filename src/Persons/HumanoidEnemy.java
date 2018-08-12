package Persons;

import Items.Armor;
import Items.Weapon;

public abstract class HumanoidEnemy extends Enemy
{
    private Weapon weaponItem;
    private Armor armorItem;

    public HumanoidEnemy(int hp, int armor, int attack, String name, Weapon weaponItem, Armor armorItem)
    {
        super(hp, armor, attack, name);
        this.weaponItem = weaponItem;
        this.armorItem = armorItem;
    }
    public void attack(Person enemy)
    {
        enemy.getHurt(humanoidEnemyRandomAttack()+weaponItem.getAttack(), weaponItem.getArmorPenetration());
    }


    public int damageValue(int amount, int armorPenetration)
    {
        return (amount * (100 - (calcArmorPenetration(armorPenetration)))) / 100; // zwraca wartość ataku po uwzględnieniu pancerza i penetracji
    }

    public int calcArmorPenetration(int armorPenetration)
    {
        return ((super.getArmor()+armorItem.getArmor()) - ((super.getArmor()+armorItem.getArmor()) * armorPenetration) / 100); //oblicza o ile penetracja osłabi pancerz
    }

    private int humanoidEnemyRandomAttack ()
    {
        return (int)(Math.random()*0.4*super.getAttack()+super.getAttack()*0.8);
    }
}
