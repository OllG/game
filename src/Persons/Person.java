package Persons;

public abstract class Person implements Attackable {
    private String name = "Test";
    private int hp;
    private int armor;
    private int attack;
    private int armorPenetration;

    public Person(int hp, int armor, int attack)
    {
        this.hp = hp;
        this.armor = armor;
        this.attack = attack;
    }


    @Override
    public void getHurt(int amount, int armorPenetration)
    {
            hp -= damageValue(amount, armorPenetration); //odejmuje z życia wartość obliczoną przez damageValue()
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

    public int getArmorPenetration() {
        return armorPenetration;
    }
}

