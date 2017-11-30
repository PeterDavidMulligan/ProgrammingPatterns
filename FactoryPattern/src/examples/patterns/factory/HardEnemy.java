package examples.patterns.factory;
/**
 * @author Peter Mulligan
 */
/**
 * A concrete implementation of an Enemy to be created by a factory.
 */
public class HardEnemy implements Enemy {
	public HardEnemy() {
		System.out.println("HardEnemy created!");
	}
}