package lesson3.tests;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "dataForDiv", parallel = true)
    public static Object[][] dataForDivTest (){
        return new Object[][]{
                {-3.0,-4.0, 0.75},
                {15.,0,5,},
                {16.0,4.0,4.0}
        };
    }
}
