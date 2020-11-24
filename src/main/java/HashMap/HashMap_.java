package HashMap;

import java.util.HashMap;

public class HashMap_<S, S1> {

    public static void main (String[] args) {

        HashMap<String,String> m = new HashMap<String,String> ();
        m.put ("G","A");
        HashMap<String,String> m2 = new HashMap<String,String> ();
        m2.put ("Z","E");
        HashMap map = new HashMap (m2);
        map.putAll (m);


        System.out.println(map);
    }
}
