package proxy;

public class Client {

	public static void main(String[] args) {
		Actable target = new Actor();
//		actor.act();
		Actable actor = new Broker(target);
		actor.act();
	}

}
