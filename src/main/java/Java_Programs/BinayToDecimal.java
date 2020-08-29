package Java_Programs;
public class BinayToDecimal {
    public static void main (String[] args) {
     Double FinalValue =0.0;
         Double binary  = 0100110110.1;
         String str = String.valueOf (binary);
         int count = str.length ();
        // int digit = binary%10;
         for (int i=0;i<count;i++) {
         Double lastdigit = binary%10;
         Double value = lastdigit*Math.pow (2,i);
         FinalValue = FinalValue + value;
         binary = binary/10; }
         System.out.println (FinalValue); }}