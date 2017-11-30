package examples.patterns.strategy;

public class AxeWeaponStrategy implements IWeaponStrategy {
	@Override
	public double getAttack() {
		return 35.0;
	}
	@Override
	public double getSpeed() {
		return 5.0;
	}
	@Override
	public double getCritChance() {
		return 7.0;
	}
}
