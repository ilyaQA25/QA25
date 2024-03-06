package lesson3.tests;

import lesson3.calc.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest extends BaseTest {

    //как проверить деление на ноль для double?
    @Test()
    public void testDivInt () {
        try {
            Assert.assertEquals(calculator.div(10, 1), 10, "wrong div");
        } catch (ArithmeticException e) {
            System.out.println("b == 0");
        }

    }

    @Test()
    public void testDivDouble () {
        Assert.assertEquals(calculator.div(10.0, 1), 10.0, "wrong div");
    }

    @Test(dependsOnMethods = "testException", alwaysRun = true)
    public void testDependsOnMethods () throws ArithmeticException {
        try {
            Assert.assertEquals(calculator.div(21.0, 0), 7.0, "wrong div");
        } catch (AssertionError error) {
            System.out.println(error);
        }

    }

    @Test(enabled = false)
    public void testEnabled () {
        try {
            Assert.assertEquals(calculator.div(0, 0), 1.5, "wrong div");
        } catch (ArithmeticException e) {
            System.out.println("b == 0");
        }
    }

    @Test(priority = -1, groups = "main test")
    public void testPriority () {
        try {
            Assert.assertEquals(calculator.div(16, 4), 4, "wrong div");
        } catch (ArithmeticException e) {
            System.out.println("b == 0");
        }

    }

    @Test(description = "just a description")
    public void testDescription () {
        try {
            Assert.assertEquals(calculator.div(21.0, 0), 7, "wrong div");
        } catch (ArithmeticException e) {
            System.out.println("b == 0");
        }
    }

    @Test(expectedExceptions = ArithmeticException.class, dependsOnGroups = "main test")
    public void testException () {
        Assert.assertEquals(calculator.div(21, 7), 7, "wrong div");
    }

    @Test(dataProvider = "dataForDiv", dataProviderClass = DataProvider.class, threadPoolSize = 3)
    public void testDataProvider (double a, double b, double expectedresult) throws ArithmeticException {
        try {
            Assert.assertEquals(calculator.div(a, b), expectedresult, "wrong div");
        } catch (AssertionError error) {
            System.out.println("b == 0");
        }
    }

    @Test(invocationCount = 3)
    public void testInvocationCount () {
        try {
            Assert.assertEquals(calculator.div(12, 0), 3, "wrong div");
        } catch (ArithmeticException e) {
            System.out.println("b == 0");
        }
    }

    @Test(invocationCount = 3, threadPoolSize = 3, invocationTimeOut = 1000)
    public void testInvocationTimeOut () throws InterruptedException {
        Thread.sleep(600);
        try {
            Assert.assertEquals(calculator.div(3.0, 4), 0.75, "wrong div");
        } catch (AssertionError error) {
            System.out.println("b ==0");
        }
    }

    @Test(testName = "division")
    public void testName() {
        try {
            Assert.assertEquals(calculator.div(12, 4), 3, "wrong div");
        } catch (ArithmeticException e) {
            System.out.println("b ==0");
        }
    }

    @Test(timeOut = 2000)
    public void testTimeOut() throws InterruptedException {
        Thread.sleep(500);
        try {
            Assert.assertEquals(calculator.div(3.0, 0), 0.75, "wrong div");
        } catch (AssertionError error) {
            System.out.println("b ==0");
        }
    }

    @Test(testName = "test with retryAnalyzer", retryAnalyzer = Retry.class)
    public void retryTest() {
        Assert.assertEquals(calculator.div(60, 3), 21);
    }

    @Test(testName = "Div double by 0 ...")
    public void testDoubleDivByZero() {
        Assert.assertEquals(Double.POSITIVE_INFINITY, calculator.div(8.7, 0), 0.0001);
    }

    @Test(testName = "Div negative-double by 0 ...")
    public void testNegativeDoubleDivByZero() {
        Assert.assertEquals(Double.NEGATIVE_INFINITY, calculator.div(-8.7, 0), 0.0001);
    }

    @Test(testName = "Div 0 by 0 ...")
    public void testNaN() {
        Assert.assertEquals(Double.NaN, calculator.div(0.0, 0.0), 0.0001);
    }
}
