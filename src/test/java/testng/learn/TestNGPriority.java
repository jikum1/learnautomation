package testng.learn;

import org.testng.annotations.Test;

public class TestNGPriority {

    @Test
    public void method1(){
        System.out.println("**********Inside method 1**********");
    }

    @Test(priority = 0)
    public void method2(){
        System.out.println("***********Inside method 2********");
    }


    @Test(priority = 1)
    public void method3(){
        System.out.println("*************Inside method 3**********");
    }
}
