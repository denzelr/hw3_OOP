import java.util.Random;

public class driver{
	private static SingletonQueue q;
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++){
			Submission s = new Submission();
			q = SingletonQueue.getInstance();
			q.add(s);
			//System.out.println(q.process());
		}
		System.out.println("Number of queues: " + SingletonQueue.numQueues);
		for (int i = 0; i <= 10; i++){
					System.out.println("Item popped off queue: " + q.process());
		}
	}
}