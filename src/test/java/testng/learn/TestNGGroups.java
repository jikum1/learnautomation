package testng.learn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGGroups {

    @BeforeClass(groups = {"smoke"})
    public void beforeClassMethod(){
        System.out.println("Inside the Before Class Method");
    }

    @BeforeTest(groups = {"smoke"})
    public void beforeTestMethod(){
        System.out.println("Inside the Before Test");
    }

    @Test(groups = {"smoke","regression"})
    public void method1(){
        System.out.println("Inside Method 1");
    }

    @Test(groups = {"smoke"})
    public void method2(){
        System.out.println("Inside Method 2");
    }

    @Test(groups = {"regression"})
    public void method3(){
        System.out.println("Inside Method 3");
    }

    @AfterClass(groups = "smoke")
    public void afterClassMethod(){
        System.out.println("Inside the after Class Methodsg");
    }
}
