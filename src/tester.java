import GameManager.GameManager;
import Items.Armor;
import Items.Armors.LeatherArmor;
import Items.Weapon;
import Items.Weapons.Sword;
import Persons.Enemies.Goblin;
import Persons.Enemy;
import Persons.Player;
import Persons.PlayerClasses.Tank;

public class tester {
    public static void main(String[] args)
    {
        Weapon playerSword = new Sword();
        Armor playerArmor = new LeatherArmor();
        Player player = new Tank(playerSword, playerArmor);
        System.out.println(player.getHp());

        Enemy goblin = new Goblin(playerSword, playerArmor);

        GameManager.battle(player, goblin);
    }
}
