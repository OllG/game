package Persons;

public abstract class Person implements Attackable {
    private String name;
    private int hp;
    private int armor;
    private int attack;

    private int level;
    private boolean isAlive;

    public Person(int hp, int armor, int attack, int level, String name)
    {
        this.level = level;
        this.hp = levelAdjustment(randomization(hp));
        this.armor = levelAdjustment(randomization(armor));
        this.attack = levelAdjustment(randomization(attack));
        this.name = name;
        isAlive = true;
    }

    private int randomization (int value)
    {
        return (int)(value*0.9 + (Math.random()*0.2*value));
    }

    private int levelAdjustment (int value)
    {
        return (int)(value+(level-1)/10*value);
    }


    @Override
    public void getHurt(int amount, int armorPenetration)
    {
        hp -= damageValue(amount, armorPenetration); //odejmuje z życia wartość obliczoną przez damageValue()
        System.out.println(name + ": obrywam za " + damageValue(amount, armorPenetration));
        if (hp<=0)
        {
            die();
        }
    }

    public void die ()
    {
        isAlive = false;
        System.out.println(this.toString() + " Zginął \n");
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

