import static java.awt.Color.*;

public class TestDrive {
    public TestDrive() {};
    public static void main(String[] args) {
        Autovehicul masina = new Autovehicul("BMW",black,100,3,200,6);
        masina.accelerare(10);
        masina.afisare_stare();

        masina.decelerare(50);
        masina.afisare_stare();

        masina.schimbare_treapta_viteza(4);
        masina.afisare_stare();

        masina.oprire();
        masina.afisare_stare();

        masina.accelerare(10,6);
        masina.afisare_stare();

    }
}
