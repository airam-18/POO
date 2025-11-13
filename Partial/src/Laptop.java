public class Laptop extends Produs{
    String procesor;
    double memorie;

    Laptop(){
        super();
        this.procesor="";
        this.memorie=0.0;
    }
    Laptop(String nume, double pret, double greutate, int vechime,String procesor, double memorie)
    {
        super(nume,pret,greutate,vechime);
        this.procesor = procesor;
        this.memorie = memorie;
    }

    @Override
    public void descriere() {
        super.descriere();
        System.out.println("Laptop; "+this.procesor+" "+this.memorie);
    }

    @Override
    public void actiune() {
        System.out.println("Lapotop: "+"poate fi pornit si utilizat");
    }

    void upgradeRAM(double newRAM)
    {
        memorie+=newRAM;
    }
}
