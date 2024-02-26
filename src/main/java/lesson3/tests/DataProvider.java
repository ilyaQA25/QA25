package lesson3.tests;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "dataForSum", parallel = true)
    public static Object[][] dataForSumTest (){
        return new Object[][]{
                {-3,-4,-7},
                {0,0,0,},
                {3,4,7}
        };
    }
}
