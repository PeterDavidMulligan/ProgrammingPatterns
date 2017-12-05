package examples.patterns.abstractfactory;
/**
 * @author Peter Mulligan
 */
/**
 * The 'client' class. It creates a ShipBuilder that
 * creates a concrete implementation of Ship. Because
 * everything is abstracted away behind the Abstract
 * Factory Pattern, this can be changed at runtime. 
 *
 */
public class AbstractFactoryPatternExample {
	public static void main(String[] args) {
	
		ShipBuilder builder = new ShipBuilder();
		
		Ship ship = builder.buildShip(ShipType.X_WING);
		ship.fireWeapon();
		
		ship = builder.buildShip(ShipType.TIE_FIGHTER);
		ship.fireWeapon();
	}
}
