package examples.patterns.factory;
/**
 * @author Peter Mulligan
 */
/**
 * Simple implementation of the Factory Pattern. In this
 * example there are 2 factories that can create 1 of 3
 * enemies. 1 factory creates enemies at random. The other
 * creates them sequentially, 1 easy, 1 medium, 1 hard.
 */
public class FactoryPatternExample {

	public static void main(String[] args) {
		
		RandomEnemyFactory rf = new RandomEnemyFactory();
		Enemy randomEnemy1 = rf.create();
		Enemy randomEnemy2 = rf.create();
		Enemy randomEnemy3 = rf.create();
		Enemy randomEnemy4 = rf.create();
		Enemy randomEnemy5 = rf.create();

		SequentialEnemyFactory sf = new SequentialEnemyFactory();
		Enemy seqEnemy1 = sf.create();
		Enemy seqEnemy2 = sf.create();
		Enemy seqEnemy3 = sf.create();
		Enemy seqEnemy4 = sf.create();
		Enemy seqEnemy5 = sf.create();
	}
}
