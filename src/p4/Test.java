package p4;

public class Test {
    public static void main(String[] args) {
        System.out.println("#101");
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}
