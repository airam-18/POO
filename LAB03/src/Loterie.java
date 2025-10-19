import java.util.*;

public class Loterie {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of values");
        int nr_of_values=sc.nextInt();

        System.out.println("enter the number of wining_rate");
        int wining_rate=sc.nextInt();
        System.out.println((wining_rate*1.0)/nr_of_values);
        long mapare_nr;
        int nr_extracted;
        int count=0;
        long mapare=0L;
        Random rand =new Random();
        for(int i=0;i<nr_of_values;i++){
            nr_extracted=rand.nextInt(100);
            mapare_nr=1L<<nr_extracted;
            if((mapare & mapare_nr)==0)
            {
                mapare|=mapare_nr;
                count++;
            }
        }
        System.out.println("The winning numbers are:");

        for(int i=0;i<nr_of_values;i++)
        {
            if(((mapare >>> i )& 1L)==1L)
            {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
