package examples.patterns.abstractfactory;
/**
 * @author Peter Mulligan
 */
/**
 * Contract interface for methods a 
 * ShipFactory must contain.
 */
public interface ShipFactory {
	/**
	 * Creates a ship.
	 */
	public Ship createShip();
}
