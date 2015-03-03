/**
* Submission.java
*
* A representation of a Submission
*/

import java.util.Random;
import java.util.ArrayList;

public class Submission implements Subject
{	
	private boolean passed;
    private Random myRandom;
	private boolean lastErrorWasTimeout;
	private ArrayList<Observer> observers;

    // You may add attributes to this class if necessary
    
	public Submission()
	{
	    myRandom = new Random();
		lastErrorWasTimeout = false;
		observers = new ArrayList<Observer>();
	}

	public void attach(Observer o){
		observers.add(o);
    }
    public void detach(Observer o){
    	int i = observers.indexOf(o);
    	if (i >= 0){
    		observers.remove(i);
    	}
    }
    public void notifies(){
    	for (Observer observer : observers) {
    		observer.update(this.passed, this.lastErrorWasTimeout);
    	}
    }

    public void runTestCase(boolean pass, boolean timeout)
	{
	    // For now, randomly pass or fail, possibly due to a timeout
		this.passed = pass;//myRandom.nextBoolean();
		if(!passed)
		{
		    this.lastErrorWasTimeout = timeout;//myRandom.nextBoolean();
		}
		
		// You can add to the end of this method for reporting purposes
		notifies();
	}
	
    public boolean wasTimeoutError()
	{
	    return lastErrorWasTimeout;
	}
}
