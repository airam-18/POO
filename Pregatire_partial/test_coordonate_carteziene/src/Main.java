import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Punct[] punct=new Punct[3];
        Scanner sc=new Scanner(System.in);
        punct[0]=new Punct(sc);
        punct[1]=new Punct(sc);
        punct[2]=new Punct(sc);

        System.out.println(Punct.Euclidian_distance(punct[0],punct[1]));

        Corpuri[] corpuri=new Corpuri[100];
        Sfera s1=new Sfera(punct[0],1);
        Sfera s2=new Sfera(punct[1],3);
        Sfera s3=new Sfera(punct[2],3);
        Cub c1=new Cub(punct[2],0);
        corpuri[0]=s1;
        corpuri[1]=s2;
        corpuri[2]=c1;

        int nrSfere=0;
        for(Corpuri c:corpuri){
            if(c==null)
                break;
            if(c instanceof Sfera)
            {
                nrSfere++;
            }
        }
        System.out.println("Numarul total de Sfere create este: "+nrSfere);

        int nrCuburi=0;
        for(Corpuri c:corpuri){
            if(c==null)
                break;
            if(c instanceof Cub)
            {
                nrCuburi++;
            }
        }
        System.out.println("Numarul total de Cub create: "+nrCuburi);
        Sfera[] s=new Sfera[nrSfere];
        int i=0;
        for(Corpuri c:corpuri){
            if(c instanceof Sfera)
            {
                s[i]= (Sfera) c;
                i++;
            }
        }

        for(int j=0;j<nrSfere;j++){
            for(int k=j+1;k<nrSfere;k++){
                if(Sfera.intersectie(s[j],s[k])==true)
                {
                    System.out.println("Se intersecteaza");
                }
                else System.out.println("Nu se intersecteaza");
            }
        }

        if(Corpuri.same_volume(s1,s2))
        {
            System.out.println("Same volume");
        }
        else System.out.println("Not same volume");

        s1.afisare();
        s2.afisare();
        s3.afisare();
        c1.afisare();
    }
}