package p3;

public class Vowel {
    private char var;

    public static void main(String[] args) {
        System.out.println("#82");
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;
        obj1.var = 'o';
        obj2.var = 'i';

        System.out.println(var1 +", "+var2);
        System.out.println(obj1.var +", "+ obj2.var);
    }
}
