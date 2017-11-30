package examples.patterns.observer;
import java.util.HashMap;
/**
 * @author Peter Mulligan
 */
/**
 * Concrete implementation of an IObserver. Acts as a rudimentary
 * emergency messaging system.
 */
public class EmergencyBroadcastSystem implements IObservable {

	private HashMap<Integer, IObserver> mCitizens;
	private int mSubscribedCitzens = 0;
	private String mMessage;
	
	/**
	 * No arg constructor initialises mCitizens HashMap.
	 */
	public EmergencyBroadcastSystem() {
		mCitizens = new HashMap<Integer, IObserver>();
	}
	@Override
	public void add(IObserver observer) {
		mCitizens.put(mSubscribedCitzens, observer);
		mSubscribedCitzens++;
	}
	@Override
	public void remove(IObserver observer) {
		mCitizens.remove(mSubscribedCitzens, observer);
		mSubscribedCitzens--;
	}
	@Override
	public void notifyObservers(String message) {
		mMessage = message;
		for (int i = 0; i < mSubscribedCitzens; i++) {
			mCitizens.get(i).update(mMessage);
		}
	}
}
