package Persons;


import Items.Armor;
import Items.Weapon;

public /*abstract*/ class Player extends Person
{
    private Weapon weaponItem;
    private Armor armorItem;

    public Player(int hp, int basicArmor, int attack, Weapon weaponItem, Armor armorItem)
    {
        super(hp, basicArmor, attack);
        this.weaponItem = weaponItem;
        this.armorItem = armorItem;
    }

    /*@Override*/
    public void attack(Person enemy)
    {
        enemy.getHurt(super.getAttack()+weaponItem.getAttack(), weaponItem.getArmorPenetration());
    }

    @Override
    public void die()
    {
        //GameManagaer.gameOver();
    }
}
