public class Pb_4 {
    public static void main(String[] args) {
        //01
        System.out.println("impartirea unui intreg la zero:");
        try{
            int x=10/0;
            System.out.println("Rezultat: "+x);
        } catch(ArithmeticException e){
            System.out.println("Eroare"+e);
        }

        //02
        System.out.println("impartirea unui double la zero:");
        double a=-10.0/0.0;
        double b=10.0/0.0;

        try{
            System.out.println("Rezultat: "+a);
            System.out.println("Rezultat:"+b);
        }
        catch(ArithmeticException e){
            System.out.println("Eroare"+e);
        }

        //03
        System.out.println("scaderea in virgula mobila din infinit un alt infinit");
        double c= Double.POSITIVE_INFINITY-Double.POSITIVE_INFINITY;
        try {
            System.out.println("Rezultat: " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Eroare"+e);
        }
        //04
        System.out.println("inmultirea in virgula mobila din infinit cu un negativ infinit");
        double d = Double.POSITIVE_INFINITY*Double.NEGATIVE_INFINITY;
        System.out.println("Rezultat:"+d);

        //05
        System.out.println("Asignare boolean la int");
        //nu complileaza
        // int i=true;

        //06
        System.out.println("Asignarea unui double lal int");
        double x=34.6;
        //int k=x;      nu compileaza;


        }
    }

