import GameManager.GameManager;
import Items.Armor;
import Items.Armors.EmptyArmor;
import Items.Armors.LeatherArmor;
import Items.Item;
import Items.Weapon;
import Items.Weapons.GoblinSword;
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

        Weapon goblinSword = new GoblinSword();
        Armor goblinArmor = new EmptyArmor();
        Enemy goblin = new Goblin(goblinSword, goblinArmor);

        GameManager.battle(player, goblin);
    }
}
