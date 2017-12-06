package examples.patterns.singleton;

public class SingletonPatternExample {

	public static void main(String[] args) {
		Player.getInstance().attack();
		Player.getInstance().attack();
		Player.getInstance().attack();
	}

}
