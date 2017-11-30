package examples.patterns.strategy;

public class LeatherArmourStrategy implements IArmourStrategy {
	@Override
	public double getDefence() {
		return 12.0;
	}
	@Override
	public double getBlock() {
		return 5.0;
	}
}
