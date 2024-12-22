package multithreading;

public class Audio extends Thread{
	
	
	public void run() {
		System.out.println("Run Method Starts!!");
		playAudio();
		System.out.println("Run Method Ends!!");
	}
	public void playAudio() {
		for(int i=1 ; i<=10; i++) {
			System.out.println("Play audio for " + i + " mins");
		}
		
	}

	
}
