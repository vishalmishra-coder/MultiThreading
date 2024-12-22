package multithreading;

public class Program1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Starts");
		for(int i=1; i<10; i++) {
			System.out.println("i is :"+ i);
			Thread.sleep(800);
		}
		System.out.println("Main ends");
	}

}
