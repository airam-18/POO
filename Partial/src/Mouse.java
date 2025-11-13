public class Mouse extends Produs{
    boolean tip;
    //false = wireless; true=fir
    private  double DPI;
    Mouse()
    {
        super();
        tip = false;
        DPI=10;
    }

    Mouse(String nume, double pret, double greutate, int vechime, boolean tip, double DPI){
        super(nume, pret, greutate, vechime);
        this.tip = tip;
        this.DPI = DPI;
    }

    @Override
    public void descriere() {
        super.descriere();
        System.out.println("Mouse: "+this.tip+" "+this.DPI);
    }

    @Override
    public void actiune() {
        System.out.println("Mouse: "+"poate fi conectat si folosit");
    }

    void schimbaDPI(double DPI){
        this.DPI =DPI;
    }
}
