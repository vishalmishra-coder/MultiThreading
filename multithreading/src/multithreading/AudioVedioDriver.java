package multithreading;

public class AudioVedioDriver {
	public static void main(String[] args) {
		Audio a = new Audio();
		a.start();
		Vedio v = new Vedio();
		v.start();
		
	}

}
