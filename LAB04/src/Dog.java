class Dog {
    static int dogCount = 0;
    String nume;
    public Dog(String nume) {
        this.nume = nume;
        dogCount += 1;
    }

    public static void latra()
    {
        System.out.println("Ham Ham");
    }
} 