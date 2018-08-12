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
    }

    public Enemy randomEnemy ()
    {
        return new Goblin();
    }


    public void battle (Person player, Person enemy)
    {
        while (player.isAlive() && enemy.isAlive())
        {
            System.out.println(enemy.toString()+ ": " +enemy.getHp());
            System.out.println(player.toString() + ": " +player.getHp());

            if(player.isAlive()) player.attack(enemy);
            if(enemy.isAlive()) enemy.attack(player);

        }
        if (player.isAlive())
        {
            playerWonBattles ++;
            System.out.println("Wygrałeś " + playerWonBattles + " bitw.");
        }
        else
        {
            gameOver();
        }
    }

    public void gameOver ()
    {
        System.out.println("Przegrałeś po " + playerWonBattles + " rundzie." );
    }
}
