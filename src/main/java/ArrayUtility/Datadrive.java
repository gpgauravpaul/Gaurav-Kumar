package ArrayUtility;
import java.io.IOException;
import java.util.ArrayList;

public class Datadrive extends ExcelUtitity {

    public static void main (String[] args) throws IOException {

        ArrayList<String> array = data("Gaurav");
        System.out.println (array.get (1));
        System.out.println (array.get (2));
    }
}
