package GameManager;

import Persons.Person;

public class GameManager
{
    public static void battle (Person person1, Person person2)
    {
        while (person1.isAlive() && person2.isAlive())
        {
            person1.attack(person2);
            System.out.println(person2.getHp());
            person2.attack(person1);
            System.out.println(person1.getHp());
        }
    }
}
