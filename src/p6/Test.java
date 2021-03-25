package p6;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.security.AlgorithmParameterGenerator;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test {
    int ans;
    public static void main(String[] args) {
        System.out.println("#166");
        FieldInit f = new FieldInit();
        f.printAll();

        System.out.println();
        System.out.println("#167");
        String[][] chs = new String[5][2];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;
//ArrayIndexOutOfBoundsException
//        for(int a = 0; a < chs.length;a++){
//            for(int b = 0; b < chs.length; b++){
//                chs[a][b] = ""+i;
//                i++;
//            }
//        }
//
//        for(String[] ca: chs){
//            for(String c: ca){
//                System.out.println(c+" ");
//            }
//            System.out.println();
//        }
        System.out.println();
        System.out.println("#168");
        String str1 = "Java";
        String str2 = new String("java");
        if (str2.equals(str1.toLowerCase())) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        System.out.println();
        System.out.println("#169");
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int a = 0; a < arr.length; a++) {
            for (int j = 0; j < arr[a].length; j++) {
                System.out.print(arr[a][j] + " ");
                if (arr[a][j].equals("B")) {
                    continue;
                }
            }
            continue;
        }
        System.out.println();
        System.out.println("#170");
        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));

        System.out.println("#171");
//        Employee e1 = new Employee();
        Employee e1 = new Employee("Jack", 5);
        Employee e2 = new Employee("Chloe", 40, 5000);

        e1.printDetails();
        e2.printDetails();
        System.out.println();
        System.out.println("#172");
        SumTest sumTest = new SumTest();
        sumTest.doSum(10, 20);
        sumTest.doSum(10.0, 20.0);
        System.out.println();
        System.out.println("#173");
        int x = 6;
        while (isAvaileble(x)) {
            System.out.print(--x);
        }

        System.out.println("#174");
        A b1 = new A();
        A b2 = new C();
//        A b3 = (B) b2;//ln1 ClassCastException
        b1 = (A) b2;//ln2

        b1.test();
//        b3.test();
        System.out.println("#175");
        int num[][] = new int[3][1];

//        for(int z = 0; z < num.length; i++){
//            for(int j = 0; j < num[z].length;j++){
//                num[z][j] = 10;
//                System.out.println(num[z][j]+" ");
//            }
//        }
        System.out.println("#176");
        System.out.println("#177");
        Base base1 = new DerivedB();
        Base base2 = new DerivedA();
        Base b3 = new DerivedB();
        Base b4 = b3;
        base1 = (Base) base2;
        base1.test();
        b4.test();
        System.out.println();
        System.out.println("#178");
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8").msg);

        System.out.println();
        System.out.println("#179");
        Test ts = new Test();
        System.out.println(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
        System.out.println();
        System.out.println("#180");
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1 = s3;
        s3 = s2;
        s1 = s2;
        System.out.println("#181");
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace("B","C");
        ta = ta.concat("D");
        System.out.println(ta);
        System.out.println();
        System.out.println("#182");
        List<String> lst = Arrays.asList("A","b","C","D");
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()){
            String e = itr.next();
            if ( e == "C"){
                break;
            }else{
//                continue;
                System.out.println(e);
            }
        }
        System.out.println();
        System.out.println("#183");
        Peacock p = new Peacock();
        p.fly();
        p.dance();

        Bird b = new Peacock();
        Peacock p2 = (Peacock) b;
        p2.fly();
        p2.dance();
        System.out.println("B");
//        Bird bird = new Bird();
//        Peacock p3 = (Peacock) bird;
        System.out.println("#184");
        int xt;
        System.out.println("E");
        x = 0;
        do{
            System.out.print("*");
        }while (x++ < 3);
        System.out.println("#185");
        int xx = 10;
        int yy = ++xx;
        int z = 0;
        if (yy >= 10 | yy <= ++xx){
            z = xx;
        }else{
            z = xx++;
        }
        System.out.println(z);
        System.out.println();
        System.out.println("#186");
        int a = 3;
        int bb = 2;
        int c = 1;
        int r1 = a * bb / c +1;
        int r2 = a / bb * c +1;
        int r3 = a * (bb /(c + 1));
        System.out.println(r1 +" : "+r2+" : "+r3);
        System.out.println();
        System.out.println("#188");
        int array1[] = {1,2,3};
        int array2[] = new int[5];
        array2 = array1;
        for (int h: array2){
            System.out.print(h+" ");
        }
        System.out.println();
        int array3[] = new int[3];
        array3 = array2;
        for (int arr2: array3){
            System.out.print(arr2+" ");
        }
        System.out.println();
        System.out.println("#189");
        System.out.println("#190");
        char colorCode = 'y';
        int color =0;
        switch (colorCode){
            case 'r':
//                int color = 100;
                  color = 100;
                break;
            case 'b':
                color = 10;
                break;
            case 'y':
                color = 1;
                break;
        }
        System.out.println(color);
        System.out.println();
        System.out.println("#191");
        Alpha ref1 = new Alpha(100);
        Alpha ref2 = new Alpha(50);
        Alpha ref3 = new Alpha(125);

        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
        System.out.println();
        System.out.println("#192");
        //Array initilization
        int array[] = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        int arr2[] = new int[] {1,2,3};
        System.out.println();
        System.out.println("#193");
        C1 obj1 = (C1) new C2();
        C2 obj2 = (C2) new C3();
//        C2 obj3 = (C2) new C1();//ClassCastException
        C3 obj4 = (C3) obj2;
        System.out.println("#195");
        int sum  = 0;
        int xVal = 0;
        for (xVal = 1; xVal <= 5; xVal++){
            sum = sum + xVal;
            System.out.println("xVal= "+xVal);
        }
        System.out.println("The sum of "+xVal+"  numbers is: "+sum);
        System.out.println();
        System.out.println("#196");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0,"Java");
        arrayList.forEach(af -> af.concat("Forum"));
        arrayList.replaceAll(s -> s.concat("Group"));
        System.out.println(arrayList);
        System.out.println();
        Double price = 200D;
        Integer pages = 20;
        System.out.println("#199");
        Playable playable = new Game2();
        List<Player> players = new ArrayList<>();
        playable.setPlayers(players);
        playable.play();
        System.out.println();
        System.out.println("#200");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(10,"IceCream"));
        productList.add(new Product(11,"Chocolate"));

        Product p1 = new Product(10,"IceCream");
        System.out.println(productList.indexOf(p1));
    }
    //#179
    public static boolean doStuff(){
        return !isAvailable;
    }
    static boolean isAvailable = true;

    //#173
    public static boolean isAvaileble(int x){
        return --x > 0 ? true : false;
    }
}
