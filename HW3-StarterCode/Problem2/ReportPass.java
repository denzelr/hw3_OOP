public class ReportPass implements Observer{
	private boolean testPass;
	public void update(boolean reportSucceeds, boolean timeout){
		this.testPass = reportSucceeds;
		// if test status is true, return the report
		if (reportSucceeds == true) {
			System.out.println("Succeed: Autograder has succeeded");
		}

	}
}