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
        return new Goblin(playerWonBattles);
    }


    public void battle (Person player, Person enemy)
    {
        while (player.isAlive() && enemy.isAlive())
        {
            if(player.isAlive()) player.attack(enemy);
            System.out.println(enemy.toString()+ ": " +enemy.getHp());
            if(enemy.isAlive()) enemy.attack(player);
            System.out.println(player.toString() + ": " +player.getHp() + '\n');

        }
        if (player.isAlive())
        {
            playerWonBattles ++;
        }
        else
        {
            gameOver();
        }
    }

    public void gameOver ()
    {
        System.out.println("Koniec gry.\nWygrałeś " + playerWonBattles + " rund." );
    }
}
