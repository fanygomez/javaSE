package p6;

public class Answer {
    public static void main(String[] args) {
        System.out.println("#176");
        int ans = 0;

        try {
            int num = 0;
            int div = 0;
            ans = num / div;

        }catch(ArithmeticException ae){
            ans = 1;    //ln1
        }catch(Exception e){
            System.out.println("Invalid calculaton");
        }

        System.out.println("Answer = "+ans); // line n2
    }
}
