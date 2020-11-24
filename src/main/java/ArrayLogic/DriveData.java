package ArrayLogic;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DriveData {
    Scanner scan = new Scanner (System.in);

    @Test
    public void test1 () throws IOException {
  System.out.println ("Please enter Column name to compare data");
     String str1 = scan.nextLine ();
        Data d = new Data();
        ArrayList a = d.data (str1);

        Data2 d2 = new Data2 ();
        ArrayList b = d2.data2 ("Name");

        boolean type = a.equals (b);

        System.out.println (type);

    }
}
