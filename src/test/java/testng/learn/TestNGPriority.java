package testng.learn;

import org.testng.annotations.Test;

public class TestNGPriority {

    @Test
    public void method1(){

    }

    @Test
    public void method2(){
        System.out.println("Inside method 2");
    }


    @Test
    public void method3(){
        System.out.println("Inside method 3");
    }
}
