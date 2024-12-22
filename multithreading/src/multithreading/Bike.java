package multithreading;

public class Bike extends Vehicle implements Runnable{
	
	public void run() {
		drive();
	}
	public void drive() {
		for(int i=1; i<=10; i++) {
			System.out.println("Bike has covered " + i + " km");
		}
	}

}
