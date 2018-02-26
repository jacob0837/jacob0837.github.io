package proxy;

public class Broker implements Actable {
	
	private Actable actor;
	public Broker(Actable actor){
		this.actor = actor;
	}
	
	public void act() {
		this.actor.act();
		 charger();
	}
	
	//
	public void charger(){
		System.out.println("经纪人在数钱~~~");
	}

}
