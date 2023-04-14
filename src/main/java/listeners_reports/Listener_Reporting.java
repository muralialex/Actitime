package listeners_reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Reporting implements ITestListener{
			
    public void onFinish(ITestContext arg0) {					
        System.out.println(arg0.getName()+"On Finish Listener");	}		
	
    public void onStart(ITestContext arg0) {					
    	System.out.println(arg0.getName()+"On Start Listener");		}		
	
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
    	System.out.println(arg0.getName()+"On TestFailedButWithinSuccessPercentage Listener");	}		

    public void onTestSuccess(ITestResult arg0) {					
    	System.out.println(arg0.getName()+"On TestSuccess Listener");	}
    
    public void onTestFailure(ITestResult arg0) {					
    	System.out.println(arg0.getName()+"On TestFailure Listener");	
    	System.out.println(arg0.getThrowable());}		

    public void onTestSkipped(ITestResult arg0) {					
    	System.out.println(arg0.getName()+"On TestSkipped Listener");	}		

    public void onTestStart(ITestResult arg0) {					
    	System.out.println(arg0.getName()+"On TestStart Listener");		}		


}
