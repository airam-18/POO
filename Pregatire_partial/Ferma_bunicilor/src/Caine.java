public class Caine extends Animale{

    private static boolean curajos;

    Caine()
    {
        super(10);
        curajos=false;
    }
    Caine(String nume, int varsta,boolean curajos) {
        super(nume,varsta,10);
        this.curajos = curajos;
    }

    static void pazeste_casa(Animale a)
    {
        if(a instanceof Caine ==false)
        {
            System.out.println("animal incorect");
        }
        else
        if(curajos==true  && a.hungry_level==true)
        {
            System.out.println("Cainele pazeste casa");
        }
        else System.out.println("Cainele este prea flamand. Hranste-l!!!");
    }

}
