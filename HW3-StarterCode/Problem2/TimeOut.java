public class TimeOut implements Observer{
	public void update(boolean reportSucceeds, boolean timeout){
		// if test status is false, print LastErrorwasTimeout
		if (reportSucceeds == false) {
			if (timeout == true) {
				System.out.println("Autograder has timed out");
			}
			else{
				System.out.println("Autograder did not time out");
			}
		}
	}
}