package GameManager;

import Persons.Enemies.Goblin;
import Persons.Enemy;
import Persons.Person;
import Persons.Player;

public class GameManager
{
  //  private Player player; // trzeba ustawić setter albo constructor

    private int playerWonBattles = 0;

    public void game (Player player)
    {
        while (player.isAlive())
        {
            battle(player, randomEnemy());
        }
        System.out.println(playerWonBattles);
    }

    public Enemy randomEnemy ()
    {
        return new Goblin();
    }


    public void battle (Person player, Person enemy)
    {
        while (player.isAlive() && enemy.isAlive())
        {
            player.attack(enemy);
            System.out.println(enemy.getHp());
            enemy.attack(player);
            System.out.println(player.getHp());
        }
        if (!player.isAlive()) gameOver();
        else playerWonBattles ++;
    }

    public static void gameOver ()
    {
        System.out.println("Przegrałeś!");
    }
}
