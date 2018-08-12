package Persons;

public abstract class Person implements Attackable {
    private String name = "Test";
    private int hp;
    private int armor;
    private int attack;
    private boolean isAlive;

    public Person(int hp, int armor, int attack)
    {
        this.hp = hp;
        this.armor = armor;
        this.attack = attack;
        isAlive = true;
    }


    @Override
    public void getHurt(int amount, int armorPenetration)
    {
        hp -= damageValue(amount, armorPenetration); //odejmuje z życia wartość obliczoną przez damageValue()
        if (hp<0)
        {
            die();
        }
    }

    public void die ()
    {
        isAlive = false;
    }

    //Metody do liczenia obrażeń


    public int getAttack()
    {
        return attack;
    }

    @Override
    public String toString()
    {
        return name;
    }


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getArmor() {
        return armor;
    }

    public boolean isAlive()
    {
        return isAlive;
    }
}

