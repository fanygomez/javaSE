package p2;

import java.util.ArrayList;
import java.util.List;

public class Test {
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
    }
}
