//author: Mociar Maria-Dalia
//date: 12.10.2025
import java.math.*;
import java.util.Scanner;

public class Boabe_grau {
    public static void main(String[] args) {
        int i;
        Scanner in = new Scanner(System.in);
        i=in.nextInt();
        BigInteger doi=BigInteger.valueOf(2);
        BigInteger total=doi.pow(i).subtract(BigInteger.ONE);
        System.out.println(total);
    }
}
