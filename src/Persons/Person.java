package Persons;

public abstract class Person implements Attackable {
    private String name;
    private int hp;
    private int armor;
    private int attack;
    private boolean isAlive;

    public Person(int hp, int armor, int attack, String name)
    {
        this.hp = hp;
        this.armor = armor;
        this.attack = attack;
        this.name = name;
        isAlive = true;
    }


    @Override
    public void getHurt(int amount, int armorPenetration)
    {
        hp -= damageValue(amount, armorPenetration); //odejmuje z życia wartość obliczoną przez damageValue()
        System.out.println(name + ": obrywam za " + damageValue(amount, armorPenetration));
        if (hp<0)
        {
            die();
        }
    }

    public void die ()
    {
        isAlive = false;
        System.out.println(this.toString() + " Zginął");
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

