import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Scanner sc=new Scanner(System.in);

        System.out.println("introdu capacitatea magazinului: ");
        int capacity=0;
        try
        {
              capacity=sc.nextInt();
        } catch (Exception e) {
            capacity=50;
        }

        Magazin magazin =new Magazin(capacity);
        magazin.addProduct(new Laptop("Lenovo",10000,1.7,2,"Intel",36));
        magazin.addProduct(new Laptop("Asus",5000,2.3,10,"Intel",200));
        magazin.addProduct(new Laptop("Lenovo",7000,3.7,1,"Region",60));
        magazin.addProduct(new Mouse("Region",200,0.5,3,true,20.3));
        magazin.addProduct(new Mouse("Apple",100,1,1,false,5.7));
        magazin.addProduct(new Telefon("Apple",3000,0.7,10,6000,"Apple"));
        magazin.addProduct(new Telefon("Samsung",5000,0.7,1,6000,"Samsung"));

        System.out.println("Afisare inainte de stergerea produselor invechite");
        magazin.afisare();
        magazin.remove_old_stuff();

        System.out.println("Afisare dupa inlaturarea produselor vechii");
        magazin.afisare();


    }
}