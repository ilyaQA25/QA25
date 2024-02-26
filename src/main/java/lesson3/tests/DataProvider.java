package lesson3.tests;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "dataForDiv", parallel = true)
    public static Object[][] dataForSumTest (){
        return new Object[][]{
                {-3,-4, 0},
                {15,3,5,},
                {3,4,0}
        };
    }
}
