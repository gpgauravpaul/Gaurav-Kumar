import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_ {
    public static void main (String[] args) {
        List<Integer> a = new ArrayList();
        List<Integer> l = new LinkedList();
        timeS(a);
        timeS(l);
    }
    public static void timeS (List<Integer> list) {
            long starttime = System.currentTimeMillis ();
            for (int i = 0; i < 1000000; i++) {
            list.add (i); }
            long endtime = System.currentTimeMillis ();
            long dif = endtime - starttime;
            System.out.println (dif + " " + list.getClass ().getSimpleName ());
    }
    }