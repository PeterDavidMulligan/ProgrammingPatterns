package examples.patterns.decorator;
/**
 * @author Peter Mulligan
 */
/**
 * Concrete class to be decorated by Equipment subclasses.
 */
public class Player extends Entity {
	public Player() {
		this.setAttack(10);
		this.setDefence(8);
	}
	@Override
	public double getAttack() {
		return this.attack;
	}
	@Override
	public double getDefence() {
		return this.defence;
	}
}
