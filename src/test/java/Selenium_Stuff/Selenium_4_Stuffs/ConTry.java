package Selenium_Stuff.Selenium_4_Stuffs;

import java.util.*;
import java.util.Map.Entry;

public class ConTry {

    public static void main (String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
map.put ("a",1);
        map.put ("b",2);
        map.put ("c",3);

       Set<Map.Entry<String,Integer>> set  = map.entrySet ();

        for(Map.Entry m : set)
        {
            System.out.println (m.getKey ());
            System.out.println (m.getValue ());
        }
    }
        }