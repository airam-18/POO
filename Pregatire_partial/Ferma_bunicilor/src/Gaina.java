public class Gaina extends Animale{
    private static int nr_oua;
    Gaina(){
        super(10);
        nr_oua=0;
    }

    Gaina(String nume, int varsta, int nr_oua){
        super(nume,varsta,10);
        this.nr_oua=nr_oua;
    }

    static void ofera_oua(Animale a){
        if(a instanceof Gaina ==false)
        {
            System.out.println("animal incorect");
        }
        else
        if(a.hungry_level==true)
        {
            System.out.println("Gaina a produs "+nr_oua+" oua.");
        }
        else System.out.println("Gaina este prea flamanda ca sa produca oua. Hraneste-o!!");
    }

}
