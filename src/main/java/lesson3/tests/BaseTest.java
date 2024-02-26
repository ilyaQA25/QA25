package lesson3.tests;

import lesson3.calc.Calculator;
import org.testng.annotations.*;

public class BaseTest {

    protected static int counter=0;
    protected Calculator calculator;

    @BeforeSuite
    public void beforeSuite(){
        counter++;
        calculator = new Calculator();
        System.out.println("beforeSuite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("beforeGroups");
    }



    @AfterSuite
    public void afterSuite(){
        System.out.println("beforeSuite");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("beforeSuite");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("beforeSuite");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("beforeSuite");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("afterSuite");
    }

    @Test
    public void archTest1(){
        System.out.println("test executed");
    }
    @Test
    public void archTest2(){
        System.out.println("test executed");
    }

}
