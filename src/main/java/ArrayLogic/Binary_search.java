package ArrayLogic;
import org.apache.commons.validator.Var;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {
    public static void main (String[] args) {
        System.out.println ("Provide an integer to search in array");
        Scanner scan = new Scanner (System.in);
        int b = scan.nextInt ();
        int a[] = {10,26,38,46,51,600,712,800,900};
        int startIn = 0;
        int start = a[startIn];
        int lastindex = a.length-1;
        int end = a[lastindex];
        int midE =0;
        int indexM =0;

   while (startIn <= lastindex)
   {
       midE = a[(startIn+lastindex)/2];
       indexM = (startIn+lastindex)/2;
       if (b < midE) {
           lastindex = indexM-1;
       }
       else if (b>midE) {
           startIn =indexM +1;
       }
       else if(midE ==b){
           System.out.println (indexM);
         break;
       }
   }
    }
}