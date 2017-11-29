/**
 * @author Peter Mulligan
 */
/**
 * Interface to define a weapon's behaviour for 'Strategy Pattern' example.
 *
 */
interface IWeaponStrategy {
	/**
	 * Calculates the attack value of the weapon.
	 * @return weapon's attack
	 */
	public double getAttack();
	/**
	 * Calculates the speed value of the weapon.
	 * @return weapon's speed
	 */
	public double getSpeed();
	/**
	 * Calculates the chance the weapon has of scoring a critical hit.
	 * @return weapon's crit chance
	 */
	public double getCritChance();
}
