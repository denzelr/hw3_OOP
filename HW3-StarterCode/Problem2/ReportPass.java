public class ReportPass implements Observer{
	public void update(boolean reportSucceeds, boolean timeout){
		// if test status is true, return the report
		if (reportSucceeds == true) {
			System.out.println("Succeed: Autograder has succeeded");
		}

	}
}