/**
 * @author Peter Mulligan
 */
/**
 * Simple example of the 'Strategy Pattern' using a Player and
 * different weapons/armours to show interchangeability afforded
 * when using this pattern.
 */
public class StrategyPatternExample {

	public static void main(String[] args) {
		//Create weapons
		SwordWeaponStrategy sword = new SwordWeaponStrategy();
		AxeWeaponStrategy axe = new AxeWeaponStrategy();
		
		//Create armour's
		LeatherArmourStrategy leather = new LeatherArmourStrategy();
		ChainArmourStrategy chain = new ChainArmourStrategy();
		
		//Create a player with a sword and leather armour and print values
		Player player = new Player(sword, leather);
		player.output();
		
		//Switch the player's weapons and print values again
		player.setWeapon(axe);
		player.setArmour(chain);
		player.output();
	}

}
