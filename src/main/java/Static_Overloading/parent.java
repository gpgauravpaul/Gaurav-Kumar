package Static_Overloading;

public class parent {

    public void test()
    {
        System.out.println("1");
    }

    public static void test(int c)
    {
        System.out.println ("2");
    }
    public static void main (String[] args) {
        parent p = new parent();
        p.test (1);
    }

}
