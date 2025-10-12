//Author: Mociar Maria-Dalia
//Date: 12-10-2025
import java.util.*;
public class Citire_consola_ex5 {
    public static void main(String[] args) {
        int val_intregi;
        float val_reale;
        Scanner in = new Scanner(System.in);
        System.out.println("introdu o valoare intrega");
        val_intregi = in.nextInt();     //citeste o linie de la consola

        System.out.println("valoarea intreaga introdusa este:"+val_intregi);

        System.out.println("introdu o valoare reala");
        val_reale = in.nextFloat();
        System.out.println("valoarea reala introdusa este:"+val_reale);



    }
}
