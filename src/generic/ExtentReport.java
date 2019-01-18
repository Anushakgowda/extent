package generic;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	public static ExtentHtmlReporter rep;
	public static ExtentReports ext;
	public static ExtentTest test;
	static
	{
		String path = "./reports/abc.html";
		rep=new ExtentHtmlReporter(path);
		 ext=new ExtentReports();
		ext.attachReporter(rep);
		ExtentTest test= ext.createTest("Test123");
//		test.log(Status.INFO, "its working.....");
		ext.flush();
		
		
		

	}

}
