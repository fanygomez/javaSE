package p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        System.out.println("#202");
        S2 sobj = new S2();
        sobj.display(10,1000);

        System.out.println("#203");
        List<String> lst = Arrays.asList("EN","FR","CH","JP");
        Iterator<String> itr = lst.iterator();
        while(itr.hasNext()){
            String e = itr.next();
            if(e == "CH"){
                break;
            }
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("#205");
        P1 obj = new P1();
        P2 obj2 = new P2();
        I1 obj3 = new P2();

//        boolean r1 = obj instanceof ;
//        boolean r2 = obj2 instanceof P1;
        boolean r3 = obj3 instanceof I1;
//        System.out.println(r1+" : "+r2+" : "+r3);
        System.out.println(r3);
        System.out.println();
        System.out.println("#207");
        String s1 = "Moon";
        OraString s2 = new OraString("Moon");

        if((s1 == "Moon") && (s2.equals("Moon"))){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
        if(s1.equalsIgnoreCase(s2.s)){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
        System.out.println();
        System.out.println("#209");
        int price = 1000;
        int qty = 2;
        String grade = "2";
        double discount = 0.0;

        switch(grade){
            case "1":
                discount = price * 0.1;
                break;
            case "2":
                discount = price  * 0.5;
//                continue;
            default:
                System.out.println("Thank You!");
        }
        System.out.println(discount);
        System.out.println();
        System.out.println("#211");
        String str = "Sweet Sweat";
        String str2 = str.trim().charAt(6)+" "+str.indexOf("Sw",1);
        System.out.println(str2);
        System.out.println();
        System.out.println("#212");
        int x;
        for(x = 100; x <= 100; x++){
            System.out.println("Welcome "+x);
        }

        System.out.println();
        System.out.println("#214");
        Cart c = new Cart();
        System.out.println(c.p+":"+c.TotalAmount);
        System.out.println();
        System.out.println("#115");
        App2 objd = new App2();
        Book objBook = new Book();
        System.out.println(objBook.pages+" : "+ objd.count);

        objd.method(objBook, objd.count);
        System.out.println(objBook.pages+" : "+ objd.count);
        System.out.println();
        System.out.println("#218");
        Predicate<Integer> p = (n) -> n % 2 == 0;
        Boolean s = p.test(100);
        System.out.println(s);
        SumTest sumTest = new SumTest();
        sumTest.doSum(10,20);
        sumTest.doSum(10.0,20.0);

        System.out.println("#220");
        FieldInit fieldInit = new FieldInit();
        fieldInit.printAll();
        System.out.println("#221");
        //compilation errors
        double y1 = 203.22;
//        float fit = y1;
//        Float fit = 100.00;
        System.out.println("#222");
        Robot r = new Humanoid();
        r.process();
        r.speak("Done");
        System.out.println("#223");
        App3 app3 = new App3();
        app3.doStuff("7007");
    }
}
