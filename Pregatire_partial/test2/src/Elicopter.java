public class Elicopter extends Aeronava{
    private double[]autonomie_zbor=new double[2];
    Elicopter()
    {
        super("unknown","unknown");
    }

    Elicopter(int nr_ore, double nr_real, String marca, String model){
        super(marca,model);
        autonomie_zbor[0]=(double)nr_ore;
        autonomie_zbor[1]=nr_real;
    }

    void afisare()
    {
        System.out.println("elicopter afisare:");
        Model_Marca();
    }



}
