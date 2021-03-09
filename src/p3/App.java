package p3;

public class App {
    private static int count;

    public static void displayMgs(){
        count++;                                            //ln1
        System.out.println("Welcome "+"Visit Count: "+count);   //ln2
    }

    public static void main(String[] args) {
        App.displayMgs(); //ln3
        App.displayMgs(); //ln4
    }
}
