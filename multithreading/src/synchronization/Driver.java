package synchronization;

public class Driver {
	public static void main(String[] args) {
		
		Table  t = new Table();
		User user1 = new User(t , 23);
		User user2 = new User(t , 50);
		User user3 = new User(t , 87);
		
//		user1.setPriority(8);
		user1.start();
		user2.start();
		user3.start();
		
	}

}
