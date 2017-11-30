package examples.patterns.factory;
/**
 * @author Peter Mulligan
 */
/**
 * A concrete implementation of an Enemy to be created by a factory.
 */
public class MediumEnemy implements Enemy {
	public MediumEnemy() {
		System.out.println("MediumEnemy created!");
	}
}
