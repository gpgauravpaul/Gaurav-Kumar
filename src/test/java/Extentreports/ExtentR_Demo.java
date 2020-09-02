package Extentreports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.Test;

public class ExtentR_Demo {

    public ExtentReports report1;
    public void cpnfig() {

        String str = System.getProperty ("user.dir")+"/results/index.html";
        ExtentSparkReporter report = new ExtentSparkReporter(str);
        report.config ().setDocumentTitle ("Demo Project report");
        report.config ().setReportName ("My techWorld");
     //   report1  = new ExtentReports();


    }
    @Test
    public void demo1() throws InterruptedException
    {
     report1.startTest ("First test");
     System.out.println ("Done");
    }
}
