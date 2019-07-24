package testng.learn;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListernersDemo {

    @Test
    public void method1(){
        System.out.println("Inside method 1");
    }

    @Test
    public void method2(){
        System.out.println("Inside method 2");
        //Assert.fail();
    }

    @Test
    public void method3(){
        System.out.println("Inside method 3");
        //throw new SkipException("Skipped method3");
    }
}
