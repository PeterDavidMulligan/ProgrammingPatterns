package examples.patterns.decorator;
/**
 * @author Peter Mulligan
 */
/**
 * Simple decorator class that assigns it's strength value
 * in it's constructor, and uses it in the getAttack method.
 * It takes an entity as a parameter in it's constructor. This
 * is what allows the decorator pattern to work.
 */
public class ShortSword extends Equipment {
	public ShortSword(Entity entity) {
		super(entity);
		this.setAttack(1.2);
		this.setDefence(0);
	}
	@Override
	public double getAttack() {
		return entity.getAttack() * this.attack;
	}
	@Override
	public double getDefence() {
		return entity.getDefence();
	}
}
