
public class ThreadQuestion extends Thread {


	public static void main(String[] args) throws InterruptedException {
	
		ThreadQuestion tq = new ThreadQuestion();
		tq.start();
		System.out.println("x");
		tq.sleep(10000);
		System.out.println("y");
	}

}
