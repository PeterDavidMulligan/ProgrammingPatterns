package examples.patterns.factory;
import java.util.Random;
/**
 * @author Peter Mulligan
 */
/**
 * This concrete implementation of the Factory interface
 * creates an enemy at random from the selection EasyEnemy,
 * MediumEnemy, and HardEnemy.
 */
public class RandomEnemyFactory implements Factory {
	@Override
	public Enemy create() {
		Random rnd = new Random();
		int selection = rnd.nextInt(2);
		Enemy enemy;;
		switch(selection) {
		case 0 : enemy = new EasyEnemy();
		break;
		case 1 : enemy = new MediumEnemy();
		break;
		case 2 : enemy = new HardEnemy();
		break;
		default : enemy = new EasyEnemy();
		System.out.println("RandomEnemyFactory line 11 switch");
		}
		return enemy;
	}
}
