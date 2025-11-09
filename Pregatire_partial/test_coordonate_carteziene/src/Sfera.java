public class Sfera extends Corpuri {
    private Punct c;
    private static int r;

    Sfera(Punct c,int r)
    {
        this.c= new Punct(c);
        this.r=r;
    }

    double Volum()
    {
        return (4*Math.PI*Math.pow(r,3))/3;
    }

    static boolean intersectie(Sfera s1, Sfera s2)
    {
        if(s1.c.p[0]==(s2.c.p[0]))
        {
            return true;
        }
        else if(s1.c.p[1]==s2.c.p[1]){
            return true;
        }
        else if(s1.c.p[2]==s2.c.p[2]){
            return true;
        }
        else
        return false;
    }

    void afisare()
    {
        System.out.println("afisare Sfera: ");
        System.out.println("culoare: "+Sfera.culoare);
        System.out.println("coordonatele centrului: x="+Sfera.this.c.p[0]+" ,y="+Sfera.this.c.p[1]+" ,z="+Sfera.this.c.p[2]);
        System.out.println("raza: "+Sfera.r);
        System.out.println("Volum: "+Volum());
    }
}
