package testng.learn;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

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
        String testRealm = System.getenv("getRealm");
        System.out.println("*****Environment Variables*****" + testRealm);
    }

}
