package Persons;

import Items.Armor;
import Items.Weapon;

public abstract class HumanoidEnemy extends Enemy
{
    private Weapon weaponItem;
    private Armor armorItem;

    public HumanoidEnemy(int hp, int armor, int attack, Weapon weaponItem, Armor armorItem)
    {
        super(hp, armor, attack);
        this.weaponItem = weaponItem;
        this.armorItem = armorItem;
    }
    public void attack(Person enemy)
    {
        enemy.getHurt(super.getAttack()+weaponItem.getAttack(), weaponItem.getArmorPenetration());
    }
}
