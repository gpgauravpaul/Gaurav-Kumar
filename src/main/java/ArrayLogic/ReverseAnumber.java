package ArrayLogic;

import java.util.Arrays;

public class ReverseAnumber {

    public static void main (String[] args) {
        int final_value =0;

        int a = 34567891;
        String b  = String.valueOf (a);
        int count =  b.length ();

        for(int i=count-1;i>=0;i--)
        {
       Character c = b.charAt (i);
       Integer d = Character.getNumericValue (c);
       final_value = final_value*10 + d;

        }
        System.out.println (final_value);
    }


}
