public class driver{
	public static void main(String[] args) {
		Submission submission = new Submission();
		Observer reportPass = new ReportPass();
		Observer timeout = new TimeOut();
		submission.attach(reportPass);
		submission.attach(timeout);
		System.out.println("Case 1: succeeds generating report");
		submission.runTestCase(true, false);
		System.out.println("Case 2: Fails but does not timeout");
		submission.runTestCase(false, false);
		System.out.println("Case 3: Timesout");
		submission.runTestCase(false, true);

		//submission.runTestCase(false, true);
	}
}