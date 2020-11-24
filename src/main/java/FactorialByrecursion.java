public class FactorialByrecursion {

    int a=1;
    public static void main (String[] args) {

         FactorialByrecursion f = new FactorialByrecursion();

         System.out.println (f.fact (6));
    }

    public int fact(int b)
            {

                if(b>1){
         a=a*b;
         fact (b-1);

                }
                return a;
            }
}
