public class Aeroport {
    private String nume;
    private static final int MAX_NR_LOCURI_AVION=5;
    private static final int MAX_NR_LOCURI_ELICOPTER=2;
    Aeroport()
    {

    };

    Aeroport(String nume) {
        this.nume=nume;
    }

    static boolean check_a(int a)
    {
        if(a<MAX_NR_LOCURI_AVION)
            return true;
        else return false;
    }

    static boolean check_e(int e){
        if(e<MAX_NR_LOCURI_ELICOPTER)
            return true;
        else return false;
    }

}
