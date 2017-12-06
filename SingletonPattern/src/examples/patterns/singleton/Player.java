package examples.patterns.singleton;
/**
 * @author Peter Mulligan
 */
/**
 * The Singleton Pattern is considered an anti-pattern by a lot
 * of programmers, but it still deserves a mention. Using a combination
 * of static members and a private constructor, the singleton pattern
 * ensures that only one instance of an object will ever exist.
 */
public class Player {
	private static Player instance;
	private static int id;
	private Player() {
		id = this.hashCode();
	}
	
	static Player getInstance() {
		if(instance == null) {
			instance = new Player();
			return instance;
		}
		else {
			return instance;
		}
	}
	
	public static void attack() {
		System.out.println("Player id : " + id + " attacked!");
	}
}
