package config;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseFile.TestBase;
import extentReport.ExtentManager;
import extentReport.ExtentTestManager;
import org.testng.*;

public class Listeners extends TestBase implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
		Log.info("=========== onFinish :-" + arg0.getName() + "===============");
		
		//extent.flush();
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		Log.info("=========== onStart :-" + arg0.getName() + "===============");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		
		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
		Log.info("Failed because of - "+ arg0.getThrowable());
		
	//	test.fail(arg0.getThrowable());
		try {
			TestBase.getScreenShot(arg0.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
		Log.info("Skipped because of - "+ arg0.getThrowable());
	}

	
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		ExtentTestManager.startTest(arg0.getMethod().getMethodName());
		Log.info(arg0.getMethod().getMethodName() + " Started");
		Log.info(arg0.getMethod().getDescription());
		
		//extent=ExtentReportsNG.reportObject();
		//test=extent.createTest(arg0.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		ExtentTestManager.getTest().log(Status.PASS, "Test passed");
		Log.info(arg0.getMethod().getMethodName() + " Passed");
		
	}

}
