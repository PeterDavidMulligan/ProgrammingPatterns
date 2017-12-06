package examples.patterns.command;

public class DefendCommand implements ICommand {
	@Override
	public void executeCommand() {
		System.out.println("Defending");
	}

	@Override
	public void undoCommand() {
		System.out.println("Undoing defend");
	}
}
