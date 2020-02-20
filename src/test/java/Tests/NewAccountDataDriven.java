package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(value = Parameterized.class)
public class NewAccountDataDriven {
    String name;
    String email;
    String phone;

//every time this test runs it will be with new set of parameters
    @Test
    public void newAccountTest(){
        System.out.println("NEW RECORD: " + name + " " + email + " " + phone);
        if (phone.equals("7894561230")){
            Assert.fail();
        }

    }

    //This annotated method is designed to pass parameters into the class via the constructors

    @Parameterized.Parameters
public static List<String[]> getData(){
      return utilities.CSV.get("C:\\Users\\willi\\Desktop\\WebdriverJavaCucumber\\UserAccounts.csv");

}
// Constructor that passes parameters to the test method
    //the constructor receives the data from the return method

    public NewAccountDataDriven(String name, String email, String phone, String gender, String password, String country,
                                String weeklyEmail, String monthlyEmail, String occasionalEmail) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
