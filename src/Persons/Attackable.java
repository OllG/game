package Persons;

public interface Attackable
{
    void getHurt(int amount, int armorPenetration);
    void attack(Person enemy);
    int damageValue(int amount, int armorPenetration);
    int calcArmorPenetration(int armorPenetration);
    void die ();
}
