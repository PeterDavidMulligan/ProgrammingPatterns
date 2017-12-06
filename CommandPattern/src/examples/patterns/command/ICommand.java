package examples.patterns.command;

public interface ICommand {
	public void executeCommand();
	public void undoCommand();
}
