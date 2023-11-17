package ExtentReportDemo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReport {

	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void TestReport()
	{
		htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add Environment details
		
		reports.setSystemInfo("Machine","testpc1" );
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("user", "Prachi");
		reports.setSystemInfo("Browser", "chrome");
		
		
		//configuration to change look and feel
		
		htmlReporter.config().setDocumentTitle("Extent Report demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
	}
	
	@Test
	public void launchBrowserandopenurl()
	{
		test = reports.createTest("Launch browser and open url");
		Assert.assertTrue(true);
	}
	
	@Test
	public void VerifyTitle()
	{
		test = reports.createTest("Verify the Title");
		Assert.assertTrue(false);
	}
	
	@Test
	public void VerifyLogo()
	{
		test = reports.createTest("Verify the Logo");
		Assert.assertTrue(false);
	}
	
	@Test
	public void VerifyEmail()
	{
		test = reports.createTest("Verify the Email");
		throw new SkipException("Skkip the test case");
	}
	
	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		System.out.println("completed testing");
	}
	
	@AfterTest
	public void testDown() {
		
		reports.flush();
	}
}
