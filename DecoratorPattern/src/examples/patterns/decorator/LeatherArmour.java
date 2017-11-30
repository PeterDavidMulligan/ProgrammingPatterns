package examples.patterns.decorator;
/**
 * @author Peter Mulligan
 */
/**
 * Simple decorator class that assigns it's defence value
 * in it's constructor, and uses it in the getDefence method.
 * It takes an entity as a parameter in it's constructor. This
 * is what allows the decorator pattern to work.
 */
public class LeatherArmour extends Equipment {
	
	public LeatherArmour(Entity entity) {
		super(entity);
		this.setAttack(0);
		this.setDefence(7);
	}
	@Override
	public double getAttack() {
		return entity.getAttack();
	}

	@Override
	public double getDefence() {
		return entity.getDefence() + this.defence;
	}
}