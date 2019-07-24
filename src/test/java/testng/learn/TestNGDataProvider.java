package testng.learn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][] {{"jitu"},{"jiten"}};
    }

    @Test(dataProvider = "data")
    public void testMethod(String firstName, String lastName){
        System.out.println("Inside the test Method");
        System.out.println("FirstName is " + firstName);
        System.out.println("LastName is " + lastName);
    }
}
