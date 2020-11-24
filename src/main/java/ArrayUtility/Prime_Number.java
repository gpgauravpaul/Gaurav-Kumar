package ArrayUtility;

import java.util.ArrayList;

public class Prime_Number {

    public static void main (String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i=1;i<=100;i++)
        {
            int temp =0;
          for (int j=2;j<i;j++)
          {
              if(i%j==0)
              {
temp = temp*10 + i;
              }
          }
    if(temp == 0)
    {
    list2.add (i);
    }
        }
        System.out.println (list2);
        System.out.println ("Count of prime numbers- "+list2.size ());
    }
}
