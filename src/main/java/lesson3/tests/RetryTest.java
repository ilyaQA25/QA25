package lesson3.tests;

import lesson3.calc.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
    private int  attempt = 1;
    @Test(retryAnalyzer = Retry.class)
    public void flackyTest(){
        if (attempt == 4){
            Assert.assertTrue(true);
        }else {
            System.out.println("attempt is: " + attempt);
            attempt++;
            throw new NullPointerException();
        }
    }
}
