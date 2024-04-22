package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureTest extends BaseTest {

    @Test(description = "failed test for screenshot")
    public void testName() {
        Assert.assertTrue(true);
    }
}