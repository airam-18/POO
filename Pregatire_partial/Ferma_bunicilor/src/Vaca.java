public class Vaca extends Animale{
    private static int nr_litrii_lapte;
    boolean clopot;
    Vaca()
    {
        super(10);
        nr_litrii_lapte = 0;
        clopot = false;
    }

    Vaca(String nume, int varsta, int nr_litrii_lapte, boolean clopot){
        super(nume, varsta,10);
        this.nr_litrii_lapte = nr_litrii_lapte;
        this.clopot = clopot;
    }

     static void mulge_vaca(Animale a)
    {
        if(a instanceof Vaca ==false)
        {
            System.out.println("animal incorect");
        }
        else
        if(a.hungry_level==true)
        {
            System.out.println("Am muls "+nr_litrii_lapte+" litrii de lapte!");
        }
        else System.out.println("Vaca este prea flamanda pentru a putea produce lapte. Hraneste-o!!!");
    }

}
