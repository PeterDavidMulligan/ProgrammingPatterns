package examples.patterns.observer;
/**
 * @author Peter Mulligan
 */
/**
 * The IObserverable interface needs to be implemented by
 * a concrete class. Denotes that the concrete class needs
 * to implement an add, remove, and notify method.
 */
public interface IObservable {
	/**
	 * Adds an IObserver to the list of IObservable objects
	 * needing to be alerted when notifying.
	 * @param observer The observer being added to the observable object.
	 */
	public void add(IObserver observer);
	/**
	 * Removes an IObserver from the list of IObservable objects
	 * needing to be alerted when notifying.
	 * @param observer The observer being added to the observable object.
	 */
	public void remove(IObserver observer);
	/**
	 * Sends a String message to any IObserver subscribed to the
	 * IObservable.
	 * @param message The message needing to be sent to
	 * IObservers
	 */
	public void notifyObservers(String message);
}
