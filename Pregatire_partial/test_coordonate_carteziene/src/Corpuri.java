import java.awt.*;

public abstract class Corpuri {
    public static Color culoare;

    Corpuri(){
        culoare = new Color(0,0,0);
    }

    Corpuri(Color c){
        culoare = c;
    }

    static boolean same_volume(Corpuri c1, Corpuri c2)
    {
        if(c1 instanceof Sfera && c2 instanceof Sfera)
        {
            if(((Sfera) c1).Volum()==(((Sfera) c2).Volum())){
                return true;
            }
            else return false;
        }
        else if(c1 instanceof Sfera && c2 instanceof Cub)
        {
            if(((Sfera) c1).Volum()== ((Cub) c2).Volum())
            {
                return true;
            }
            else return false;
        }
        else if(c1 instanceof Cub && c2 instanceof Sfera)
        {
            if(((Cub) c1).Volum()== ((Sfera) c2).Volum())
            {
                return true;
            }
            else return false;
        }
        else if(c1 instanceof Sfera && c2 instanceof Sfera)
        {
            if(((Sfera) c1).Volum()==((Sfera) c2).Volum())
            {
                return true;
            }
            else return false;
        }
        else return false;
    }
}
