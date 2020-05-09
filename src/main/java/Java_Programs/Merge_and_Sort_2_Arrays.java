package Java_Programs;
import java.util.ArrayList;
public class Merge_and_Sort_2_Arrays {
    public static void main (String[] args) {
        int a[] = {2, 3, 4, 5};
        int b[] = {0, 7, 6, 9, 8};
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        // 2 3 4 5 0 7 6 9
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i]; }
        int temp = 0;
        for(int j=0;j<c.length;j++)
        {
        for (int i = 0; i < (c.length - 1)-j; i++) {
            if(c[i]>c[i+1]) {
       temp = c[i];
       c[i]=c[i+1];
       c[i+1]=temp; }
           }
        }
        for(int i=0;i<c.length;i++)
        {
            System.out.println (c[i]);
        }
    }
    }