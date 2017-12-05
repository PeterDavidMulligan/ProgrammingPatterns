package examples.patterns.abstractfactory;
/**
 * @author Peter Mulligan
 */
/**
 * This class is the middle man that the client
 * asks to create an object for it. It has an instance
 * of 2 factory classes that both return concrete Ships.
 */
public class ShipBuilder {
	private XWingFactory xWingFactory;
	private TieFighterFactory tieFighterFactory;
	
	public ShipBuilder() {
		xWingFactory = new XWingFactory();
		tieFighterFactory = new TieFighterFactory();
	}
	/**
	 * Returns a Ship of the type specified with the
	 * ShipType Enum.
	 * @param type Enum of Ship types.
	 * @return Ship of the type specified
	 */
	public Ship buildShip(ShipType type) {
		switch(type) {
		case X_WING :
			return xWingFactory.createShip();
		case TIE_FIGHTER :
			return tieFighterFactory.createShip();
		default :
			System.out.println("ShipBuilder.java : Default reached in switch - buildShip()");
			return null;
		}
	}
}
