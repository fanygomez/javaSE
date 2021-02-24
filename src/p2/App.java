package p2;

public class App {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
        //line n1

        if (str2.equals(str1.toLowerCase())){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
