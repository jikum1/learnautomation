package testng.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {


    @Test
    public void method1(){
        Assert.assertEquals("Jitu","Jitu","Checking Jitu");
        Assert.assertNotEquals("jitu","jitu1","Checking String 2");
        Assert.assertTrue(true, "Checking the Assert True");
        Assert.assertFalse(false,"Checking the Assert False");
        String str = null;
        Assert.assertNull(str, "Inside assert Null");
    }
}
