package p6;
class E1 extends Exception {}
class  E2 extends RuntimeException{}
public class App2 {
    public void m1() throws E1 {
        System.out.println("m1.Accesed...");
        throw new E1();
    }

    public void m2() {
        System.out.println("m2.Accesed...");
        throw new E2();
    }

    public static void main(String[] args) throws E1 {
        int level = 1;
        App2 obj = new App2();
        if (level <= 5 && level >= 3){
            obj.m1();
        }else {
            obj.m2();
        }
    }
}
