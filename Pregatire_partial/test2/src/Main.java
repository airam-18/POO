import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aeroport aeroport=new Aeroport("Dubai_airline");
        int a=0;
        int e=0;
        while(true)
        {

            if(aeroport.check_a(a)==false && aeroport.check_e(e)==false) {
                System.out.println("am ocupat toate locurile disponibile din aeroport");
                break;
            }
            if(aeroport.check_a(a)==false)
            {
                System.out.println("Nu mai avem locuri pentru avioane");
                break;
            }
            if(aeroport.check_e(e)==false)
            {
                System.out.println("Nu mai avem locuri pentru elicopter");
                break;
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marca: ");
            String marca = sc.nextLine();
            System.out.println("Enter model: ");
            String model=sc.nextLine();
            Avion avion=new Avion(20, marca, model);
            a++;
            Elicopter elicopter=new Elicopter(100,30.0,marca,model);
            e++;

            avion.afisare();
            elicopter.afisare();
            System.out.println("Numar de avioane: "+a);
            System.out.println("Numar de elicopter: "+e);
        }
    }
}