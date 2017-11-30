package examples.patterns.decorator;
/**
 * @author Peter Mulligan
 */
/**
 * This abstract class is the root object of the Decorator Pattern's
 * hierarchy. It is this class Type that the decorations will take
 * as a parameter in their constructors. It is also this class that
 * the base object (Player), and the base decoration (Equipment) will
 * inherit from.
 */
abstract class Entity {
	
	public double attack;
	public double defence;
	
	/**
	 * Returns the current attack of the entity, which
	 * is the attack value after all layers have done their calculations
	 * @return Current attack of entity
	 */
	public abstract double getAttack();
	/**
	 * Returns the current defence of the entity, which
	 * is the defence value after all layers have done their calculations
	 * @return Current defence of entity
	 */
	public abstract double getDefence();
	/**
	 * Sets the attack value of this layer.
	 * @param attack New attack value
	 */
	public void setAttack(double attack) {
		this.attack = attack;
	}
	/**
	 * Sets the defence value of this layer
	 * @param defence New defence value
	 */
	public void setDefence(double defence) {
		this.defence = defence;
	}
}
