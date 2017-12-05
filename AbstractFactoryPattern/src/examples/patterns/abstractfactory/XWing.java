package examples.patterns.abstractfactory;
/**
 * @author Peter Mulligan
 */
/**
 * One of the 2 concrete implementations that
 * ShipBuilder can currently build.
 */
public class XWing implements Ship {
	@Override
	public void fireWeapon() {
		System.out.println("The X-Wing fires it's KX9 laser cannons!");
	}
}
