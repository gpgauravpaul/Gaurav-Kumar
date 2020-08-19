package Default;

public class main implements Default_I,Default_2 {
    public static void main (String[] args) {

        main m = new main ();
        m.interface1 ();

    }


    @Override
    public void interface1 () {
    Default_I.super.interface1 ();
    Default_2.super.interface1 ();


    }
}
