public class TimeOut implements Observer{
	private boolean passed;
	private boolean timeout;
	public void update(boolean reportSucceeds, boolean timeout){
		// if test status is false, print LastErrorwasTimeout
		this.passed = reportSucceeds;
		this.timeout = timeout;
		if (reportSucceeds == false) {
			if (timeout == true) {
				System.out.println("Failed: Autograder has timed out");
			}
			else{
				System.out.println("Failed: Autograder did not time out");
			}
		}
	}
}