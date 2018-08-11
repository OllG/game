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
    public int damageValue(int amount, int armorPenetration)
    {
        return (amount * (100 - (calcArmorPenetration(armorPenetration)))) / 100; // zwraca wartość ataku po uwzględnieniu pancerza i penetracji
    }

    public int calcArmorPenetration(int armorPenetration) // DO POPRAWY
    {
        return (armor - (armor * armorPenetration) / 100); //oblicza o ile penetracja osłabi pancerz
    }
    public int getHp()
    {
        return hp;
    }

    public int getAttack()
    {
        return attack;
    }

    @Override
    public String toString()
    {
        return name;
    }


}

