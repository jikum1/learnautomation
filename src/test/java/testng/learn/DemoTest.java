package testng.learn;

import org.testng.Assert;
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
        Assert.fail("***Failed****");
    }


    /*Add here javadoc.*/
    @Test(groups = {"Regression"})
    public void method3(){
        System.out.println("****Inside method 3**");
        String testRealm = System.getenv("getRealm");
        System.out.println("*****Environment Variables*****" + testRealm);
        String property = System.getProperty("getTest");
        System.out.println("*****System Property******" +  property);
        Assert.fail("***Failed****");
    }

}
