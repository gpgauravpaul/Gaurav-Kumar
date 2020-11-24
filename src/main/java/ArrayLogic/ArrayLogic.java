package ArrayLogic;

import java.util.*;

public class ArrayLogic {

    public static void main (String[] args) {

        String[] inputList = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                "aug", "Sep", "Oct", "nov", "Dec"};

        System.out.println ("Unsorted Array");
        showList (inputList);


        List list = Arrays.asList (inputList);
        System.out.println ("====");
        System.out.println (list);
        Collections.sort (list,String.CASE_INSENSITIVE_ORDER);
        System.out.println (list);
        System.out.println ("====");
        Arrays.sort (inputList,String.CASE_INSENSITIVE_ORDER);
        System.out.println ("\n"+"Case S. Sorted Array");
        showList (inputList);


    }

    public static void showList (String[] a) {
        for (String str : a) {
            System.out.print (str + " ");
        }


    }
}