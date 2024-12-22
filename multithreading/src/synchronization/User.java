package synchronization;

public class User extends Thread{
	
	Table t;
	int n;
	User(){
		
	}
	
	User(Table t , int n){
		this.t = t;
		this.n = n;
	}
	
	public void run() {
		t.printTable(n);
	}
	

}
