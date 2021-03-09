package p3;

import java.util.ArrayList;
import java.util.List;

class MyException2 extends RuntimeException { }

public class Test {
      String myStr = "7007";
    public static void main(String[] args) {
        System.out.println("#72");
        try {
         method1();
        }catch (MyException2 ne){
            System.out.println("A");
        }
        System.out.println();
        System.out.println("#72");
        Test obj = new Test();
        obj.doStuff("9009");
        System.out.println("#73");
        System.out.println("#74");
        int nums1[] = {1,2,3};
        int nums2[] = {1,2,3,4,5};
         nums2 = nums1;
        for (int x: nums2) {
            System.out.print(x +" :");
        }
        System.out.println();
        System.out.println("#75");
        Product p1 = new Product(101,"Pen");
        Product p2 = new Product(101,"Pen");
        Product p3 = p1;

        boolean ans1 = p1 == p2;
        boolean ans2 = p1.name.equals(p2.name);
        System.out.println(ans1 +" : "+ ans2);

        System.out.println("#76");
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
        //ln1
        employee.salary = 50_000;
        director.salary = 80_000;
        manager.budget = 200_000;
        director.stockOptions = 500;
        System.out.println("#77");
        System.out.println("#78");

        int n [][] = {{1,3}, {2,4}};
        for (int i = n.length -1 ; i >= 0; i--) {
            for (int y : n[i]){
                System.out.print(y);
            }
        }
        System.out.println();
        System.out.println("#79");
        Caller c = new  Caller();
//        c.start();
//        c.init();
        System.out.println("#80");
        int ans = 0;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        }catch (ArithmeticException ae){
//            ans = 0;  // ln1
        }catch (Exception e){
            System.out.println("Invalid calculation!!");
        }
        System.out.println("Answer = "+ ans); //ln2

        System.out.println();
        System.out.println("#81");
        MyField m1 = new MyField();
        m1.x = 100;
        m1.y = 200;

        MyField m2 = new MyField();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();
        System.out.println("#82");
        System.out.println("#83");
        Integer avar = 9;

        if(avar++ < 10){
            System.out.println(avar+" Hello Universe!");
        }else if(++avar < 10){
            System.out.println(avar +" Hello Word!");
        }else {
            System.out.println(avar+" Hello coders!");
        }

        System.out.println("#84");
        String s =  "Java SE 8 I";
        int len = s.trim().length();
        System.out.println(len);
        System.out.println(s.trim());

        System.out.println("#85");
        System.out.println("#86");
        int[][] arr = new int[2][4];
        arr[0] = new int []{1,3,5,7};
        arr[1] = new int []{1,3};

        for (int[] a: arr) {
            for (int i:a){
                System.out.print(i +" ");
            }
            System.out.println();
        }

        String stuff = "TV";
        String rest = null;

        if(stuff.equals("TV")){
            rest = "Walter";
        }else if(stuff.equals("Movie")){
            rest = "White";
        }else {
            rest = "No Result...";
        }
        System.out.println(rest);
       String rest2 = stuff.equals("TV")? "Walter":stuff.equals("Movie")?"White":"No Result";
        System.out.println(rest2);

        System.out.println("#89");

        List ps = new ArrayList();
        Patient patient =  new Patient("Fany");
        ps.add(patient);

        int f = ps.indexOf(patient);
        if(f >= 0){
            System.out.println(patient.name+ " Found ");
        }

        System.out.println("#91");
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline",80,"Short");
        System.out.println(wolf.type+" "+wolf.maxSpeed+" "+wolf.bounds);
        System.out.println(tiger.type+" "+tiger.maxSpeed+" "+tiger.bounds);

        System.out.println("#92");
        String names[] = {"Thomes","Peter","Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        try {
            for (String name: names) {
                pwd[idx] = name.substring(2,6);
                idx++;
            }
        }catch (Exception e){
            System.out.println("Invalid Name");
        }
        System.out.println("Pwd");
        for (String p:pwd
             ) {
            System.out.println(p);
        }

        System.out.println("#93");

        Employe e1 = new Employe("Dylan",1);//ln1
        Employe e2 = new Employe("Fany",27);
        Employe e3 = new Employe("Sebastian",1,1000);

        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
        System.out.println("#95");
        A b1 = new A();
        A b2 = new C();

        b1 = (A) b2;    //lin1
//        A b3 = (B) b2;  //ln2
        b1.test();
        b2.test();
        System.out.println("#96");
        System.out.println("#97");
        int numbers[] = {12,13,42,32,15,15,23,51,12};
        int[] keys = findMax(numbers);
    }
    //#97
    public static int[] findMax(int[] max){
        int[] keys = new int[3];
        return  keys;
    }
    // #72
    public void doStuff(String str){
        int myNum = 0;
        try{
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        }catch(NumberFormatException ne){
            System.err.println("Error");
        }
        System.out.println("myStr: "+ myStr+", myNum: "+myNum);
    }
    // #71
    public static void method1() {//ln1
        try {
            throw Math.random() > 0.5 ? new MyException2() : new RuntimeException();
        }catch (RuntimeException re){
            System.out.println("B");
        }

    }
}

 class Caller {
    private void init(){
        System.out.println("Initialized");
    }

    private void start(){
        init();
        System.out.println("Started...");
    }
}

