import java.util.Queue;
import java.util.LinkedList;


public class SingletonQueue{
	private static SingletonQueue instance;
	Queue<Submission> q;
	private SingletonQueue(){
		q = new LinkedList<Submission>();
	}
	public static SingletonQueue getInstance(){
		if(instance == null){
			instance = new SingletonQueue();
		}
		return instance;
	}
	public void add(Submission submission){
		q.add(submission);
	}
	public void process(){

	}

}