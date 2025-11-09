public class Avion extends Aeronava{
    private int nr_locuri;
    Avion()
    {
        super("necunoscut","necunoscut");
        nr_locuri=60;
    }

    Avion(int nr_locuri,String marca, String model){
       super(marca,model);
        this.nr_locuri = nr_locuri;
    }

    void afisare()
    {
        System.out.println("avion afisare");
        Model_Marca();
    }

}
