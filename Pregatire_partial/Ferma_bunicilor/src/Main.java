import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdu nr maxim de animale: ");
        int n=0;
        try{
         n=sc.nextInt();
        }
        catch(Exception e){
            n=10;
        }
        Animale animale=new Animale(n);
        Animale[] a=new Animale[n];

       a[0]=new Caine("Lizy",5,true);
       a[1]=new Caine("Lizy",5,true);
       a[2]=new Gaina("Pip",1,10);
       a[3]=new Gaina("Cock",10,0);
       a[4]= new Vaca("Veta",3,2,true);
       a[5]= new Vaca("Geta",10,7,false);
       a[6]= new Vaca("Saveta",1,0,true);
       a[7]= new Vaca("Petite",2,3,false);

       System.out.println("Simulare hranirea animalelor:");
       //hranim o parte din animale;
        a[0].mancare("beef","Japan",3);
        a[3].mancare("corn","grandpa garden",5);
        a[4].mancare("papusoi","grandpa garden",10);
        a[5].mancare("grass","field",4);
        a[7].mancare("grass","field",5);
       for(int i=0;i<8;i++)
       {
           if(a[i].hungry_level==true)
           {

               System.out.println("the animal has been feed");
           }
           else System.out.println("the animal is Hungry!!!");

       }

       Vaca.mulge_vaca(a[4]);
       Vaca.mulge_vaca(a[6]);
       Gaina.ofera_oua(a[3]);
       Caine.pazeste_casa(a[3]);
       Caine.pazeste_casa(a[2]);
       Caine.pazeste_casa(a[0]);

       for(int i=0;i<n;i++)
       {
           if(a[i] instanceof Caine)
               if(a[i].varsta>10)
               {
                   a[i]=null;
               }
           else if(a[i] instanceof Gaina)
               {
                   if(a[i].varsta>8)
                   {
                       a[i]=null;
                   }
               }
           else if(a[i] instanceof Vaca)
               {
                   if(a[i].varsta>16)
                   {
                       a[i]=null;
                   }
               }
       }

       for(int i=0;i<n;i++)
       {
           if(a[i]!=null)
            System.out.println(a[i].nume+" "+a[i].varsta);
       }

    }
}