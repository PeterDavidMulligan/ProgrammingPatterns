/**
 * @author Peter Mulligan
 */
/**
 * The IObserver interface needs to be implemented by
 * a concrete class. Denotes that the concrete class needs
 * to implement an update method that takes a string message
 * as a paramter.
 */
public interface IObserver {
	/**
	 * The update method is called by an IObservable object.
	 * @param message The message that the IObserverable is
	 * broadcasting.
	 */
	public void update(String message);
}
