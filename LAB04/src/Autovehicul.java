import java.awt.*;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private int viteza_c;
    private int treapta_de_viteza_c;
    private int viteza_max;
    private int nr_trepte_viteza_pos;

    static String nr_matricol;
    Sofer sofer=new Sofer("Popescu","Marcel",40,1234);

    Rezervor rezervor=new Rezervor(100,20);

    public Autovehicul(String marca, Color culoare, int viteza_c,int treapta_de_viteza_c,
                       int viteza_max, int  nr_trepte_viteza_pos) {
        this.marca = marca;
        this.culoare = culoare;
        this.viteza_c = viteza_c;
        this.treapta_de_viteza_c = treapta_de_viteza_c;
        this.viteza_max = viteza_max;
        this.nr_trepte_viteza_pos = nr_trepte_viteza_pos;
    }

    public void accelerare(int km)
    {
        if(km>0 && viteza_c+km<=viteza_max)
        {
            viteza_c+=km;
        }
    }

    public void decelerare(int km)
    {
        if(km>0 && viteza_c-km>=0)
        {
            viteza_c-=km;
        }
    }

    public void schimbare_treapta_viteza(int k)
    {
        if(k<=nr_trepte_viteza_pos){
            treapta_de_viteza_c=k;
        }
    }

    public void oprire()
    {
        viteza_c=0;
        treapta_de_viteza_c=0;
    }

    public void afisare_stare()
    {
        System.out.println("afisare_stare_sutovehicul:");
        System.out.println("marca:"+marca);
        System.out.println("Culoare:"+culoare);
        System.out.println("viteza_c:"+viteza_c);
        System.out.println("treapta_de_viteza_c:"+treapta_de_viteza_c);
    }

    //supraincarcare
    public void accelerare(int acceleratie, int secunde)
    {
        if(acceleratie>0 & secunde>0)
        {
            int count=acceleratie*secunde;
            viteza_c+=count;
            if(viteza_c>viteza_max)
                viteza_c=viteza_max;
        }
    }

}
