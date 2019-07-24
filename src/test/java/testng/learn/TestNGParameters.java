package testng.learn;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {

    @Test(description = "Inside TestNGParameters !! Class")
    @Parameters({"username","password"})
    public void testParameters(@Optional("jitu") String username, @Optional("kumar") String password){
        System.out.println("Username is "  + username);
        System.out.println("Password is " + password);
    }
}
