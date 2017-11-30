/**
 * @author Peter Mulligan
 */
/**
 * Concrete implementation of an IObserver that receives
 * a message from an IObservable and prints it to console.
 *
 */
public class Citizen implements IObserver {
	private String mMessage;
	
	/**
	 * The update method takes a string and assigns it to
	 * the local variable.
	 * 
	 * @param message The message sent from an IObserver
	 */
	public void update(String message) {
		mMessage = message;
		printMessage();
	}
	
	/**
	 * Prints whatever is saved to the local message
	 * variable.
	 */
	private void printMessage() {
		System.out.println(mMessage);
	}

}
