package multithreading;

public class Car extends Thread{
	public void run() {
		System.out.println("car runs");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
//		System.out.println("ID is : " + Thread.currentThread().getId());
		drive();
	}
	
	public void drive() {
		System.out.println("Drive Starts !!");
		for(int i=1; i<=10; i++) {
			System.out.println("Car Completes " + i + " km");
		}
		System.out.println("Drive Ends !!");
	}

}
