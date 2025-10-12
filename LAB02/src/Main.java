//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.println("Short max: " + maxShort + " min: " + "-> +1 = "+ (maxShort +1));
        System.out.println("Short min: " + minShort + " min: " + "-> -1 = "+ (short)(minShort -1));

        //Interger
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("Int max: " + maxInt + " min: " + "-> +1 = "+ (maxInt +1));
        System.out.println("Int min: " + minInt + " min: " + "-> -1 = "+ (int)(minInt -1));

        //long
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("Long max: " + maxLong + " min: " + "-> +1 = "+ (maxLong +1));
        System.out.println("Long min" + minLong + " min: " + "-> -1 = "+ (long)(minLong -1));

        //Float
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println("Long max: " + maxFloat + " min: " + "-> +1 = "+ (maxFloat +1));
        System.out.println("Float min: " + minFloat + " min: " + "-> -1 = "+ (float)(minFloat -1));

        float rezultatFloat =maxFloat *2;
        float rezFloat = maxFloat/0;

        System.out.println("Floatmax * 2"+ rezultatFloat);
        System.out.println("Floatmax /0 "+ rezFloat);

        double nr_double = Double.MAX_VALUE;
        double rand_double = Math.random();
        System.out.println(nr_double*1.999-rand_double);
        System.out.println(nr_double*1.999+rand_double);

    }
}