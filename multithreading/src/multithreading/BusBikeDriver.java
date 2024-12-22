package multithreading;

public class BusBikeDriver {
	public static void main(String[] args) {
		System.out.println("Main Thread " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Bus bus = new Bus();
		Bike bike = new Bike();
		Thread t1 = new Thread(bus);
		Thread t2 = new Thread(bike);
//		t2.setDaemon(true);
		t1.start();
		t2.start();
	}

}
