import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileOutputStream {


    public static void main (String[] args) throws IOException {

        Properties pr = new Properties();
        FileInputStream fis = new FileInputStream ("/Users/gaurav.pauloutlook.in/Gaurav-Kumar/.idea/config.properties");
        pr.load(fis);
        pr.setProperty ("Name","Gaurav");
        pr.setProperty ("Color","Fair");
        pr.setProperty ("Height","5.2");
        FileOutputStream fos = new FileOutputStream("/Users/gaurav.pauloutlook.in/Gaurav-Kumar/.idea/config.properties");
        pr.store(fos, "Data stored");


    }


}
