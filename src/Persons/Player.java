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

    public void attack(Person enemy)
    {
        enemy.getHurt(super.getAttack()+weaponItem.getAttack(), weaponItem.getArmorPenetration());
    }

    public int damageValue(int amount, int armorPenetration)
    {
        return (amount * (100 - (calcArmorPenetration(armorPenetration)))) / 100; // zwraca wartość ataku po uwzględnieniu pancerza i penetracji
    }

    public int calcArmorPenetration(int armorPenetration) // DO POPRAWY
    {
        return (super.getArmor() - (super.getArmor() * armorPenetration) / 100); //oblicza o ile penetracja osłabi pancerz
    }
    public int getHp()
    {
        return super.getHp();
    }

    public void die()
    {
        //GameManagaer.gameOver();
    }
}
