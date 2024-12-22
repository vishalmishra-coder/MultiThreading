package multithreading;

public class Bus extends Vehicle implements Runnable{
	
	public void run() {
		drive();
	}
	public void drive() {
		for(int i=1; i<=10; i++) {
			System.out.println("Bus has covered " + i + " km");
		}
	}

}
