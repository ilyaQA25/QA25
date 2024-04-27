package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;
import steps.NavigationSteps;

public class EndToEndTest extends BaseTest {
   /* (@Optional("Ilya") String firstName,
    @Optional("Prez") String lastName,
    @Optional("22001") String postalCode)*/
    /*@Parameters({"firstName-param", "lastName-param", "code-param"})
    @Test(testName = "e2e Adding to cart and checkout")*/
    @Test
    public void e2eTest (){
        NavigationSteps navigationSteps = new NavigationSteps();
        navigationSteps.logIn(ReadProperties.username(),ReadProperties.password());
    }
}
