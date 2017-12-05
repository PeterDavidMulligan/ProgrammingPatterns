package examples.patterns.abstractfactory;
/**
 * @author Peter Mulligan
 */
/**
 * A concrete implementation of ShipFactory that produces
 * Tie Fighters.
 */
public class TieFighterFactory implements ShipFactory {
	@Override
	public Ship createShip() {
		return new TieFighter();
	}
}
