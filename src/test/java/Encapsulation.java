public class Encapsulation {

        int a = 0;
    }
    class b
    {

        public static void main(String[] args) {


            int a = 0;
            int	b = a+1;
            int c=0;

            for(int i=0;i<10;i++) {

                c=a+b;

                a=b;
                b=c;

            }


        }
