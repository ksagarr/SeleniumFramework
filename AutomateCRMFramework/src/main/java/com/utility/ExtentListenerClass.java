/**
 * 
 */
package com.utility;



import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * @author ksagar
 *
 */
public class ExtentListenerClass implements ITestListener{
	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configureReport()
	{
		htmlReporter = new ExtentSparkReporter("ExtendReportTest.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//Add System information to reports
		reports.setSystemInfo("Machine", "ksagarpc");
		reports.setSystemInfo("OS", "Windows 8.1");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("User Name", "ksagar");
		
		//Configuration to look/feel of report
		
		htmlReporter.config().setDocumentTitle("Extent Report For Test Case");
		htmlReporter.config().setReportName("Test Case Execution Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Name of Test Start Method "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of test method Pass:" +result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the pass test case is:"+result.getName(), ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Name of test method failed:" +result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is:"+result.getName(), ExtentColor.RED));
		String path=System.getProperty("user.dir")+"\\Screenshot\\"+result.getName()+".png";
		File scf= new File(path);
		if(scf.exists()) {
			test.fail("Captured Screenshot is below:"+test.addScreenCaptureFromPath(path));
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		test=reports.createTest(result.getTestName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip test case is:"+result.getName(), ExtentColor.YELLOW));
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		configureReport();
		System.out.println("On Start Method invoked.....");
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Finish Method invoked.....");
		reports.flush();
	}

	
}
