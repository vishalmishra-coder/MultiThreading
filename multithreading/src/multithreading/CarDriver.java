package multithreading;

public class CarDriver {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.setName("Tata");
		c2.setName("Maruti");
		c3.setName("BMW");
		c1.start();
		System.out.println("=================");
		c2.start();
		System.out.println("=================");
		c3.start();
		c2.setPriority(7);

		
	}

}
