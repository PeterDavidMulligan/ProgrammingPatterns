package examples.patterns.decorator;
/**
 * @author Peter Mulligan
 */
/**
 * A simple program that equips a player with a sword and then a shield to
 * show how the 'Decorator Pattern' works. In this example the decorator pattern is
 * used to get around the problem of 'class explosion' created by needing multiple
 * configurations of a single concept.
 */
public class DecoratorPatternExample {
	public static void main(String[] args) {	
	
		//Create an entity and print it's stats
		Entity player = new Player();
		System.out.println("With no equipment :");
		System.out.println("Attack : " + player.getAttack() + "\nDefence : " + player.getDefence());
		
		//Wrap it in a sword and print stats again
		player = new ShortSword(player);
		System.out.println("\nWith a sword :");
		System.out.println("Attack : " + player.getAttack() + "\nDefence : " + player.getDefence());
		
		//Wrap it in armour and print stats again
		player = new LeatherArmour(player);
		System.out.println("\nWith a sword and leather armour :");
		System.out.println("Attack : " + player.getAttack() + "\nDefence : " + player.getDefence());
		
		//Wrap it in another sword and print stats again
		player = new ShortSword(player);
		System.out.println("\nWith 2 swords and leather armour :");
		System.out.println("Attack : " + player.getAttack() + "\nDefence : " + player.getDefence());
	}
}
