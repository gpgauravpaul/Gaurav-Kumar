import java.util.ArrayList;

public class Duplicacy {

    // Find the distinct element from an array of numbers.  

    public static void main (String[] args) {

        int a[]= {1,2,3,4,5,6,7,2,5,3};
int count = a.length;

 ArrayList list = new ArrayList();

        for (int i=0;i<count;i++)
        {
            int counter = 0;
            for (int j=0;j<count;j++)
            {
                if (a[i]==a[j])
                {
                 counter++;
                }
            }
            if (counter ==1)
            {
list.add (a[i]);
            }
        }
    System.out.println (list);
    }
}
