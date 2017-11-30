package examples.patterns.decorator;
/**
 * @author Peter Mulligan
 */
/**
 * Abstract class that all decorations inherit from. Ensures
 * they all take an Entity in their default constructor.
 */
abstract class Equipment extends Entity {
	Entity entity;
	public Equipment(Entity entity) {
		this.entity = entity;
	}
}
