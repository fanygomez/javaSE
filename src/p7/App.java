package p7;

public class App {
    static int foo;
    static int bar;
    String greet = "Welcome!";
    public App(){
        String greet ="Hello!";
    }

    public void setGreet(){
        String greet = "Good Day!";
    }

    static void process(){
        foo += 10;
        bar += 10;
    }
    public static void main(String[] args) {
        System.out.println("#206");
        App t= new App();
        String greet = "Good Luck!";
        System.out.println(t.greet);

        System.out.println("#208");

        App firstObj = new App();
        App.process();
        System.out.println(firstObj.bar);

        App secondObj = new App();
        App.process();
        System.out.println(secondObj.bar);

    }
}
