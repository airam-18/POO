public class Cub extends Corpuri{
    private Punct p;
    private static int l;

    Cub(Punct p, int l) {
        this.p = p;
        this.l = l;
    }

    double Volum(){
        return Math.pow(l,3);
    }

    void afisare()
    {
        System.out.println("afisare Cub: ");
        System.out.println("culoare:"+Cub.culoare);
        System.out.println("colt: x= "+Cub.this.p.p[0]+", y= "+Cub.this.p.p[1]+", z= "+Cub.this.p.p[2]);
        System.out.println("lungime latura: "+ Cub.l);
        System.out.println("Volum: "+Volum());
    }


}
