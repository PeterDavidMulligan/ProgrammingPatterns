package examples.patterns.factory;
/**
 * @author Peter Mulligan
 */
/**
 * This concrete implementation of the Factory interface
 * creates an enemy sequentially from EasyEnemy,
 * MediumEnemy, and HardEnemy. After it reaches the end
 * it starts back at EasyEnemy.
 */
public class SequentialEnemyFactory implements Factory {
	int tracker = 0;	
	@Override
	public Enemy create() {
		Enemy enemy;
		switch(tracker % 3) {
		case 0 : enemy = new EasyEnemy();
		break;
		case 1 : enemy = new MediumEnemy();
		break;
		case 2 : enemy = new HardEnemy();
		break;
		default : enemy = new EasyEnemy();
		System.out.println("RandomEnemyFactory line 11 switch");
		}
		tracker++;
		return enemy;
	}

}
