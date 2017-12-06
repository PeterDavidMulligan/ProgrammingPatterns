package examples.patterns.command;

import java.util.ArrayList;
import java.util.Random;

public class CommandPatternExample {

	public static void main(String[] args) {
		
		int[] actionBuffer = new int[10];
		Player player = new Player(new AttackCommand(), new DefendCommand());
		
		int turns = 10;
		int tmp;
		Random rnd = new Random();
		
		for(int i = 0; i < turns; i++) {
			tmp = rnd.nextInt(2);
			actionBuffer[i] = tmp;
		}
		for(int i = 0; i < turns; i++) {
			switch(actionBuffer[i]) {
			case 0 :
				player.executeAttack();
				break;
			case 1 : player.executeDefend();
				break;
			}
		}
		for(int i = turns - 1; i >= 0; i--) {
			switch(actionBuffer[i]) {
			case 0 :
				player.undoAttack();
				break;
			case 1 : player.undoDefend();
				break;
			}
		}
		
	}

}
