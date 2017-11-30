/**
 * @author Peter Mulligan
 */
/**
 * Interface to define an armour's behaviour for 'Strategy Pattern' example.
 *
 */
interface IArmourStrategy {
	/**
	 * Calculates the armour's defence value.
	 * @return armour's defence
	 */
	public double getDefence();
	/**
	 * Calculates the chance the weapon has of scoring a critical hit.
	 * @return critical chance of weapon
	 */
	public double getBlock();
}