
public class SwordWeaponStrategy implements IWeaponStrategy {
	@Override
	public double getAttack() {
		return 20.0;
	}
	@Override
	public double getSpeed() {
		return 7.0;
	}
	@Override
	public double getCritChance() {
		return 5.0;
	}
}
