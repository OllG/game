package Persons;

public interface Attackable
{
    //public static final int A = 5;

    void getHurt(int amount, int armorPenetration);
    void attack(Person enemy);
    int damageValue(int amount, int armorPenetration); // to powinno wypaść z interfejsu
    int calcArmorPenetration(int armorPenetration);    // to też
    void die ();
    static void died ()
    {
        //ok statyczne mogą mie ciało
    }

    //default może mieć ciało, będzie standardowo implementowaną metodą, możemy użyć @Override
    default String diedd ()
    {
        return "ABC";
    }

    //metody domyślne mogą mieć ciało
}
