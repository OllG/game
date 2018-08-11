package Items;

public abstract class Weapon extends Item
{
    private int attack;
    private int armorPenetration;


    public Weapon(int attack, int armorPenetration)
    {
        super();
        this.attack = attack;
        this.armorPenetration = armorPenetration;
    }

    public int getAttack()
    {
        return attack;
    }

    public int getArmorPenetration()
    {
        return armorPenetration;
    }

    public Weapon()
    {
    }
}
