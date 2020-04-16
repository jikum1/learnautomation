
package testng.learn;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class IgnoreAnnotations {

    @Test
    public void method1(){
        System.out.println("Inside method 1");
    }

    //@Ignore
    @Test
    public void method2(){
        System.out.println("Inside method 2");
    }
}
