public class Animale {
    String nume;
    int varsta;
    private final int NR_MAXIM_ANIMALE;
    boolean hungry_level;
    Animale(int nr_maxim_animale)
    {
        NR_MAXIM_ANIMALE = nr_maxim_animale;
        nume = "";
        varsta=0;
        hungry_level=false;
    };
    Animale(String nume, int varsta, int nrMaximAnimale) {
        this.nume = nume;
        this.varsta = varsta;
        NR_MAXIM_ANIMALE = nrMaximAnimale;
        hungry_level=false;
    }

    void mancare(String nume, String origine, int cantitate){
        System.out.println("food type: "+nume+", Origin:"+origine+", Quantity:"+cantitate);
        hungry_level=true;
    }

}
