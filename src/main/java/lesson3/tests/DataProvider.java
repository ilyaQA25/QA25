package lesson3.tests;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "dataForDiv", parallel = true)
    public static Object[][] dataForDivTest (){
        return new Object[][]{
                {8,4, 2},
                {15,0,5},
                {16,4,4}
        };
    }
}
