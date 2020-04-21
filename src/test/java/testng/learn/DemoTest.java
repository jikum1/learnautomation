package testng.learn;

import org.testng.annotations.Test;

public class DemoTest {

    @Test(groups = {"Smoke"})
    public void method1(){
            System.out.println("Inside method 1");
    }

    @Test(groups = {"Regression"})
    public void method2(){
        System.out.println("Inside method 2");
    }


    @Test(groups = {"Regression"})
    public void method3(){
        System.out.println("****Inside method 3**");
    }

}
