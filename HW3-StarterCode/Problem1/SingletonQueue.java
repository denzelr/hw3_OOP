import java.util.Queue;
import java.util.LinkedList;


public class SingletonQueue{
	private static SingletonQueue instance;
	public static int numQueues = 0;
	Queue<Submission> q;
	private SingletonQueue(){
		System.out.println("queue initialized");
		q = new LinkedList<Submission>();
	}
	public static SingletonQueue getInstance(){
		if(instance == null){
			numQueues++;
			instance = new SingletonQueue();
		}
		return instance;
	}
	public void add(Submission submission){
		q.add(submission);
		System.out.println(q);
	}
	public Submission process(){
		Submission submission = q.poll();
		return submission;
	}
}