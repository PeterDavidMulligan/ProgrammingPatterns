package examples.patterns.factory;
/**
 * @author Peter Mulligan
 */
/**
 * This is the interface that ensures all factory classes
 * that implement it have the 'create()' method that returns
 * an Enemy. They can do this however they like.
 */
public interface Factory {
	/**
	 * The create method is used by all classes implementing
	 * this interface to return an object of superclass Enemy
	 * type.
	 * @return the enemy created by the factory
	 */
	public Enemy create();
}
