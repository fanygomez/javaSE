package p2;

import p1.Acc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    static boolean isAvailable = false;

    public static void main(String[] args) {
        System.out.println("#23");
        int x = 100;
        int a = x++;
        System.out.println("a2 "+a);
        int b = ++x;
        System.out.println("b2 "+b);
        int c = x++;
        System.out.println("c22 "+c);
        int d = (a < b) ? (a < c) ? a: (b < c)? b: c :x;
        System.out.println(d);
        System.out.println();
        System.out.println("#24");
        Short s1 = 200;
        Integer s2 = 400;
        //String s3 = (String) (s1 + s2);
        Long s4 = (long) s1 +s2;
        System.out.println("Sun is "+s4);
        System.out.println("#25");
        System.out.println("#26");
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if (names.remove("Bran")){
            names.remove("Jon");
            System.out.println("Delete");
        }
        System.out.println(names);
        System.out.println("#28");
        X xx1 = new X();
        X xx2 = new X();
        xx1.i = 3;
        xx1.j = 4;
        xx2.i = 5;
        xx2.j = 6;
        System.out.println(
                xx1.i+" "+
                        xx1.j+""+
                        xx2.i+" "+
                        xx2.j);
        System.out.println();
        System.out.println("#29");
        int[] array = new int[2];
        array[0] = 10;
        array[1] = 20;
        System.out.print("array: " + array[0] + " : " + array[1]);
        System.out.println("  ");
        System.out.println();
        System.out.println("#30");
   String[] arr = {"A", "B","C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i].equals("C")){
                continue;
            }
            System.out.println("Work done...");
            break;
        }
        System.out.println();
        System.out.println("#33");
        Alpha ref1 = new Alpha(100);
        Alpha ref2 = new Alpha(50);
        Alpha ref3 = new Alpha(125);


        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
        System.out.println();
        System.out.println("#34");
        int ii=0;
        int jj=7;
        for (ii= 0; ii < jj -1; ii =ii+2) {
            System.out.println("ii "+ii);
            System.out.println("jj "+(jj-1));
        }
        System.out.println("#35");
        LocalDate date1 = LocalDate.now();
//        LocalDate date2 = LocalDate.of(6,20,2014); //error Exception LocalDate.of(Year,month,dayOfMonth);
        LocalDate date2 = LocalDate.of(2014,6,20);
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = "+date1);
        System.out.println("date2 = "+date2);
        System.out.println("date3 = "+date3);
        System.out.println();
        System.out.println("#36");

        StringBuilder sb1 =  new StringBuilder("Duke");
        String str1 = sb1.toString();
        //insert code
        String str2 = str1;// true
//        String str2 = new String(str1);// false
//        String str2 = sb1.toString();// false
//          String str2 = "Duke";//false
        System.out.println(str1 == str2);
        System.out.println();
        System.out.println("#37");
        Test ts = new Test();
        System.out.print(isAvailable +" ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);

        System.out.println("#38");
        double discount = 0;
        int qty = 91;
        discount = (qty >=90)? 0.5 : (qty > 80)? 0.2 : 0;
        System.out.println(discount);

        System.out.println("");
        if (qty >= 90){
            discount = 0.5;
        }

        if (qty > 80 && qty < 90){
            discount = 0.20;
        }
        System.out.println(discount);
        System.out.println();
        System.out.println("#41");
        String[] planets = {"Mercury","Venus","Earth","Mars"};
        System.out.println(planets.length);
        System.out.println(planets[1].length());
        System.out.println("#42");
        System.out.println("");
        System.out.println(maskCC("1234-5678-9101-1121"));
        System.out.println();
        System.out.println("#43");
        /*
       -> DISTINTO PAQUETE
            - Variables privadas y protegidas no son accesibles
             - Solo es accesible la variable s
        -> MISMO PAQUETE
            - solo son accesible variables p,s
         */
        Acc obj = new Acc();
        obj.s = 10;
        System.out.println();
        System.out.println("#44");

        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();

        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
        System.out.println();
        System.out.println("#45");
        ArrayList myList = new ArrayList();
        String[] myArray;
//
//        try {
//            while (true){
//                myList.add("My String");
//            }
//        }catch (RuntimeException re){
//            System.out.println("Caught a RuntimeException");
//        }catch (Exception e){
//            System.out.println("Caught an Exception");
//        }
//        System.out.println("Ready to use...");
        System.out.println("#46");
        System.out.println("h1 5 + 2 = "+3+4);
        System.out.println("5 + 2 = "+(3+4));
        System.out.println(" ");
        System.out.println("#47");
        List<Person> iList = Arrays.asList(new Person("Hank",45),
                new Person("Charlie",400),
                new Person("Smith",38));
//        checkAge(iList,p -> p.getAge() > 40);
        System.out.println(" ");
        System.out.println("#48");
        String[][] arry = { { "A", "B", "C" }, { "D", "E"} };
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arry[i][j] + " before if");
//                System.out.println("");
//                if (arry[i][j].equals("B")) {
//                    System.out.println("");
//                    System.out.println("break"+arry[i][j]);
//                    break;
//                }
//            }
//            continue;
//        }
        System.out.println("");
        System.out.println("#49");
        String str = " ";
        //str = str.trim();
        System.out.println(str.equals("")+" "+str.isEmpty());
    }
    //47
//    public static void checkAge(List<Person> list, Predicate<Person> predicate){
//        for (Person p : list){
//            if (predicate.test(p)){
//                System.out.println(p.name+" ");
//            }
//        }
//    }
    //42
    public static String maskCC(String creditCard){
        String x = "XXXX-XXXX-XXXX";
        //ln1
        //return x + creditCard.substring(15,19); // A
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard,15,19);
        return sb.toString();
    }

    //#37
    public static boolean doStuff(){
        return !isAvailable;
    }
}
