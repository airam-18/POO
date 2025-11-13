public class Telefon extends Produs {
    double capacitate_baterie;
    String sistem_operare;

    Telefon() {
        super();
        this.capacitate_baterie = 0.0;
        this.sistem_operare = "";
    }

    Telefon(String nume, double pret, double greutate, int vechime, double capacitate_baterie, String sistem_operare) {
        super(nume, pret, greutate, vechime);
        this.capacitate_baterie = capacitate_baterie;
        this.sistem_operare = sistem_operare;
    }

    @Override
    public void descriere() {
        super.descriere();
        System.out.println("Telefon " + this.capacitate_baterie + " " + this.sistem_operare);
    }

    @Override
   public void actiune() {
        System.out.println("Telefon actiune: "+"poate fi apelat sau folosit la mesaje");
    }

    void incarcaBaterie(double creste_baterie){
        capacitate_baterie+=creste_baterie;
    }
}

