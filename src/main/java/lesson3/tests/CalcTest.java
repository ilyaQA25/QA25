package lesson3.tests;

import lesson3.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest extends BaseTest {
    @Test
    public void testSum(){
        Assert.assertEquals(calculator.sum(3,4),7, "wrong sum");

    }
    @Test(dataProvider = "dataForSum", dataProviderClass = DataProvider.class, threadPoolSize = 3)
    public void testDataProvider(int a, int b, int expectedresult) throws InterruptedException{
        Assert.assertEquals(calculator.sum(a,b),expectedresult, "wrong sum");
        counter++;
    }

    @Test(invocationCount = 3)
    public void testSum2(){
        Assert.assertEquals(calculator.sum(3,4),7, "wrong sum");
    }
     @Test(testName = "rename")
    public void testSum3(){
        Assert.assertEquals(calculator.sum(3,4),7, "wrong sum");
        counter++;
    }


}
