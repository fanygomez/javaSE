package p3;
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

