public abstract class Produs {
    String nume;
    double pret;
    double greutate;
    int vechime;
    Produs(){

    }

    Produs(String nume, double pret, double greutate, int vechime) {
        this.nume = nume;
        this.pret = pret;
        this.greutate = greutate;
        this.vechime = vechime;
    }

    public void descriere(){
        System.out.println("Produs: Descriere");
    }

    public abstract void actiune();

}
