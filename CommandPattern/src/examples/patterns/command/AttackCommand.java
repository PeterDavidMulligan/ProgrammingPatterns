package examples.patterns.command;

public class AttackCommand implements ICommand {
	Player target;
	@Override
	public void executeCommand() {
		System.out.println("Attacking");
		
	}
	@Override
	public void undoCommand() {
		System.out.println("Undoing attack");
	}
}
