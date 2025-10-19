import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Impachetare_ex2 {
    public static void main(String[] args) {

        int varsta,sex,inaltime;
        Scanner sc = new Scanner(System.in);
        System.out.println("introdu varsta");
        varsta=sc.nextInt();
        System.out.println("introdu sex-ul");
        sex=sc.nextInt();
        System.out.println("introdu inaltime");
        inaltime=sc.nextInt();
        short info_impachetata;

        //impachetare
        info_impachetata=(short)((((varsta<<1)|sex)<<8)|inaltime);
        //<<1 pentru a face loc variabilei sex care este pe un bit
        //<<8 pentru a face loc var inaltime care este pe 8 biti

        //despachetare
        inaltime=info_impachetata&0xff; //8 biti de 1=0xff
        sex=info_impachetata&1;         //1 bit
        varsta= info_impachetata&0x7f;  //7 biti de 1=0111 1111 =7f



    }
}