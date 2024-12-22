package multithreading;

public class Vedio extends Thread{
	
	public void run() {
		System.out.println("Run Vedio Starts!!");
		playVedio();
		System.out.println("Run Vedio Ends!!");
	}
	
	public void playVedio() {
		for(int i=1; i<=10; i++) {
			System.out.println("Play Vedio for " + i + " mins");
		}
	}

}
