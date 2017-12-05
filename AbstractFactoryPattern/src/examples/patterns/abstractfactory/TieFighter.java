package examples.patterns.abstractfactory;
/**
 * @author Peter Mulligan
 */
/**
 * One of the 2 concrete implementations that
 * ShipBuilder can currently build.
 */
public class TieFighter implements Ship {
	/**
	 * Prints a message to console to confirm
	 * who fired their weapon.
	 */
	@Override
	public void fireWeapon() {
		System.out.println("The Tie Fighter fires it's Ls-1 laser cannons!");
	}
}
