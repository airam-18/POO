import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punct {
    int[] p=new int[3];
    private final int dim = 30;
    Punct() {
        p=new int[]{0,0,0};
    };

    public Punct(Punct alt) {
        this.p[0] = alt.p[0];
        this.p[1] = alt.p[1];
        this.p[2] = alt.p[2];
    }

    Punct(Scanner sc)
    {
        while(true){
            System.out.println("introdu x,y,z:(intre -"+dim+" si "+dim+")");
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(set_coordonate(x,y,z))
            {
                break;
            }
            else System.out.println("Coordonatele nu sunt valide.Main incearca!!!");
        }
    }
    boolean set_coordonate(int x,int y,int z)
    {

        if(x<=dim && x>=-dim && y<=dim && y>=-dim && z<=dim && z>=-dim) {
            p[0] = x;
            p[1] = y;
            p[2] = z;
            return true;
        }
        else {
            p= new int[]{0, 0, 0};
            return false;
        }
    }

    static double Euclidian_distance(Punct p1, Punct p2){
        double d=0;
        double x3=p1.p[0]-p2.p[0];
        if(x3<0)
            x3=-x3;
        x3=pow(x3,2);
        double y3=p1.p[1]-p2.p[1];
        if(y3<0)
            y3=-y3;
        y3=pow(y3,2);
        double z3=p1.p[2]-p2.p[2];
        if(z3<0)
            z3=-z3;
        z3=pow(z3,2);
        d=Math.sqrt(x3+y3+z3);
        return d;
    }


}
