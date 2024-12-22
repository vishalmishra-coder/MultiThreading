package multithreading;

public class Test {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("Id is : " + Thread.currentThread().getId());
		System.out.println(Thread.currentThread().isDaemon());
		Car c1 = new Car();
		Car c2 = new Car();
		c1.setName("Tata");
		c2.setName("Maruti");
		c2.setPriority(9);
		c1.start();
		c2.start();
		
	}

}
