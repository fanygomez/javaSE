package p4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test {
    //#129
    int x,y;
    static int count =  0;
    int i = 0;
    //#118
    public static int stVar = 100;
    public  int var = 200;
    public static void main(String[] args) {
        System.out.println("#101");
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());

        System.out.println();
        System.out.println("#102");

        Test check1 = new Test();
        Test check2 = new Test();
        check1.changeCount();
        check2.changeCount();

        System.out.println(check1.count+" : "+ check2.count);

        System.out.println("#103");
        ArrayList<Integer> points = new ArrayList<>();

        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(1);
        points.remove(null);
        System.out.println(points);

        System.out.println("#104");
        int numbers[];
        numbers = new int [2];
        numbers[0] = 10;
        numbers[1] = 20;

        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;
        for(int x: numbers){
            System.out.print(" "+ x);
        }

        System.out.println("#105");
//        float flt = 100.00F;
        float flt = (float) 1_11.00;
//        Float flt = 100.00;//Error C
//        double y1 = 203.22;
//        float flt = y1;//Error
//        int y2 = 100;
//        float flt = (float) y2 ;
        System.out.println("#108");
        int[] stack = {10,20,30};
        int size = 3;
        int idx = 0;
        while(idx < size -1){
            idx++;
            System.out.println("The Top element: "+ stack[idx]);
        }

        System.out.println("#109");
        String myStr = "Hello World";
        myStr.trim();
        int i1 = myStr.indexOf(" ");
        System.out.println(i1);
        System.out.println();
        System.out.println("#112");
        int data[] = {2010,2013,2014,2015,2014};
        int key = 2014;
        int count = 0;
        for(int e: data){
            if(e != key){
                count++;
                continue;
            }
        }
        System.out.println(count+ " Found");

        System.out.println();
        System.out.println("#113");
        LocalDateTime dt = LocalDateTime.of(2014,7,31,1,1);
        LocalDateTime dt2 = dt.plusDays (30);
        LocalDateTime dt3 = dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
        System.out.println(dt2);
        System.out.println(dt3);
        System.out.println();
        System.out.println("#115");
        CheckingAccount acct = new CheckingAccount();
        System.out.println(acct.amount);
        //ln2
//        acct.amount = 100;
        System.out.println();
        System.out.println("#116");
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
        System.out.println("#117");
        float var1 = (12_345.01 <= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.println(var2);
        System.out.println();
        System.out.println("#118");
        Test t1 = new Test();
        t1.var = 300;
        System.out.println(t1);

        Test t2 = new Test();
        t2.stVar = 300;
        System.out.println(t2);
        System.out.println("#119");
        C2 obj1 = new C1();
        I obj2 = new C1();

        C2 s1 = (C1) obj2;
        I t = obj2;
        t.displayI();
        s1.displayC2();

        System.out.println("#121");
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();

        std1 = std3;
        std3 = std2;
        std2 =  null;

        System.out.println();
        System.out.println("#122");

        int wd = 0;
        String days[] = {"sun","mon","wed","sat"};
        for(String s:days){
            switch(s){
                case "sat":
                case "sun":
                    wd -=1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd +=2;
            }
        }
        System.out.println(wd);
        System.out.println();
        System.out.println("#123");
//        LocalDate date = LocalDate.of(2012,01,32);// java.time.DateTimeException
        LocalDate date = LocalDate.of(2012,01,31);
        LocalDate daten = date.plusDays(10);
        System.out.println(date);
        System.out.println(daten);
        System.out.println();
        System.out.println("#124");
        int i = 10;
        int j = 20;
        int k = (j += i)/5;
        System.out.println(i +" :   "+j+" : "+k);
        System.out.println();
        System.out.println("#125");
        Book book1 = new Ebook();
        book1.readBook();
        System.out.println();
        System.out.println("#126");
        List colors = new ArrayList();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        System.out.println(colors);
        colors.remove(2);
        System.out.println(colors);
        colors.add(3,"cyan");
        System.out.println(colors);
        System.out.println();
        System.out.println("#129");
        int x =3, y = 5;
        Test obj = new Test(x,y);
        System.out.println(x+" "+y);
        System.out.println("****");
        System.out.println(obj.x+" "+obj.y);
        System.out.println();
        System.out.println("#130");

        int array[] = {10,20,30,40,50};
        int x1 = array.length;
        System.out.println("A");
        while (x1 >0 ){
            x1--;
            System.out.print(array[x1]);
        }
        System.out.println("B");
//        do {
//            x1--;
//            System.out.println(array[x1]);
//        }while (x >= 0);
        System.out.println("C");
        while (x1 >= 0){
            System.out.println(array[x1]);
            x1--;
        }
        System.out.println("D");
//        do{
//            System.out.println(array[x1]);
//            --x1;
//        }while (x1 >=0);
        System.out.println("E");
        while (x1 > 0){
            System.out.print(array[--x1]);
        }
    }
    // 129
    public Test(){}
    public Test(int x, int y){
        initializate(x,y);
    }

    public void initializate(int x, int y){
        this.x = x * x;
        this.y = y * y;
    }
    public String toString(){
        return stVar+" : "+ var;
    }
    // 116
    public static void callExport(Exportable ex){
        ex.export();
    }
    //102
    public void changeCount(){
        while(i < 5){
            i++;
            count++;
        }
    }
}