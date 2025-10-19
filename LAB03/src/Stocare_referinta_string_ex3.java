import java.util.Scanner;

public class Stocare_referinta_string_ex3 {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        a = sc.nextLine();
        int n = a.length();
        int vocale=0;
        int consoane=0;
        while(n>0)
        {

            switch(a.charAt(n-1))
            {
                case 'a','A':
                case 'e','E':
                case 'i','I':
                case 'o','O':
                case 'u','U':

                {
                    vocale++;
                    break;
                }

                default:
                {
                    consoane++;
                }
            }
            n--;

        }
        System.out.println("vocale = "+vocale);
        System.out.println("consoane = "+consoane);

    }
}
