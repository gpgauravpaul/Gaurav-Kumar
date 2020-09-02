package Java_Programs;

import java.util.Random;

public class Random_Unique_Numbers {

    public static void main (String[] args) {
        Random r = new Random();


int i=0;
        while(i<11) {
            int ran = r.nextInt (100);
            System.out.println (ran);
i++;
        }
//        for (int i=1;i<=100;i++)
//        {
//            int ran = r.nextInt (100);
//            System.out.println (ran);
//        }

    }
}
