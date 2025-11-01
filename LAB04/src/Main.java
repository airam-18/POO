public class Main{
    public static void main(String[] args) {
        Person p = new Person("Initial Person");
        Person.modify1(p);
        System.out.println("Method modify1(Person p):" + p.getName());
        Person.modify2(p);
        System.out.println("Method modify2(Person p):" + p.getName());

        Dog d= new Dog("azorel");
        System.out.println(d.dogCount);
        d.latra();
    }
}