package examples.patterns.factory;
/**
 * @author Peter Mulligan
 */
/**
 * A concrete implementation of an Enemy to be created by a factory.
 */
public class EasyEnemy implements Enemy {
	public EasyEnemy() {
		System.out.println("EasyEnemy created!");
	}
}
