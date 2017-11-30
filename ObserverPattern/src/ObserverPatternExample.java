/**
 * @author Peter Mulligan
 */
/**
 * Simple mock messaging system to show off
 * how the 'Observer Pattern' works.
 */
public class ObserverPatternExample {

	public static void main(String[] args) {
		EmergencyBroadcastSystem ebs = new EmergencyBroadcastSystem();
		Citizen c1 = new Citizen();
		Citizen c2 = new Citizen();
		Citizen c3 = new Citizen();
		ebs.add(c1);
		ebs.add(c2);
		ebs.add(c3);
		ebs.notifyObservers("There's a big wave coming. You should probably... like... move.");
		ebs.notifyObservers("PUT THE SURFBOARDS DOWN!");
	}
}
