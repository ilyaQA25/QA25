package lesson3.tests;

import lesson3.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalcTest extends BaseTest {
    @Test
    public void testDiv(){
        Assert.assertEquals(calculator.div(3,4),0, "wrong sum");

    }
    @Test(enabled = false)
    public void testEnabled(){
        Assert.assertEquals(calculator.div(3,4),0, "wrong sum");

    }

    @Test(priority = -1)
    public void testPriority(){
        Assert.assertEquals(calculator.div(3,4),0, "wrong sum");

    }

    @Test(expectedExceptions = AssertionError.class)
    public void testException(){
        Assert.assertEquals(calculator.div(3,4),7, "wrong sum");
    }

    @Test(dependsOnMethods = "testException", alwaysRun = true)
    public void testDependsOnMethods(){
        Assert.assertEquals(calculator.div(3,4),0, "wrong sum");

    }
    @Test(description = "just a description")
    public void testDescription(){
        Assert.assertEquals(calculator.div(3,4),0, "wrong sum");

    }
  @Test(dataProvider = "dataForDiv", dataProviderClass = DataProvider.class, threadPoolSize = 3)
    public void testDataProvider(int a, int b, int expectedresult) throws InterruptedException{
        Assert.assertEquals(calculator.div(a,b),expectedresult, "wrong sum");

    }

    @Test(invocationCount = 3)
    public void testInvocationCount(){
        Assert.assertEquals(calculator.div(3,4),0, "wrong sum");
    }



    @Test(invocationCount = 3, threadPoolSize = 3, invocationTimeOut = 1000)
    public void testInvocationTimeOut() throws InterruptedException {
        Thread.sleep(600);
        Assert.assertEquals(calculator.div(3,4),0, "wrong sum");
    }
     @Test(testName = "division")
    public void testName(){
        Assert.assertEquals(calculator.div(3,4),0, "wrong sum");

    }
    @Test(timeOut = 2000)
    public void testTimeOut() throws InterruptedException{
        Assert.assertEquals(calculator.div(3,4),0, "wrong sum");
        Thread.sleep(500);
    }

}
