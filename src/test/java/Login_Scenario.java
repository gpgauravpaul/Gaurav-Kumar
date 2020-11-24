import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Scenario {

   @DataProvider
    private Object[][] data()
   {
       Object obj[][] = new Object[2][2];
 obj[0][0] = "user1";
 obj[0][1] = "password1";
 obj[1][0] = "user2";
 obj[1][1] = "Password2";

 return obj;
   }

   @Test (dataProvider = "data")
    public void login(String username, String password)
   {
System.out.println (username);
       System.out.println (password);

       Assert.assertEquals (password,"Password2");
   }

}
