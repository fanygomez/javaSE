package p5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    static int count = 0;
    int x,y;
    int a1;
    public static void doProduct(int a){
        a = a * a;
    }
    public static void doString(String s){
        s.concat(" "+s);
    }

    public static void main(String[] args) {
        System.out.println("#131");
        Test item = new Test();
        item.a1 = 11;
        String sb = "Hello";
        Integer i = 10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i+" "+sb+" "+item.a1);
        System.out.println("#132");
//        String[] arr = ("Hi","How","Are","You");
//        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
//        if (arrList.removeIf((String s) -> (s.length() <= 2))){
//            System.out.println(s+ " removed");
//        }
        System.out.println("#134");
        Student[] students = new Student[3];
        students[0] = new Student("Fanny");
        students[1] = new Student("Richard");
        students[2] = new Student("Richard");

        for (Student s: students){
            System.out.println(" "+s.name);
        }

        System.out.println("#135");
        char[][] grid = new char[3][3];
        grid[1][1] = 'X';
        grid[0][0] = '0';
        grid[2][0] = 'X';
        grid[0][1] = '0';
        grid[2][2] = 'X';
        grid[1][2] = '0';
        //ln1
        grid[2][1] = 'X';

        System.out.println();
        System.out.println("#136");
        int x = 1;
        int y = 0;
        if (x++ > ++y){
            System.out.println("Hello");
        }else {
            System.out.println("Welcome ");
        }
        System.out.println("Log "+ x +" : "+y);

        System.out.println("#139");
        int[][] arr2 = new int[2][4];

        arr2[0] = new int[]{1,3,5,7};
        arr2[1] = new int[]{1,3};

        for (int[] a: arr2){
            for (int c =0; c < arr2.length;c++){
                System.out.print(a[c]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("#143");
        int n[][] = {{1,3,},{2,4}};

        for (int in = n.length -1; in >=0; in--){
            for (int j = n[in].length -1; j >=0;j--){
                System.out.print(n[in][j]);
            }
        }
        System.out.println();
        System.out.println("#144");
        int x2 = 9;
        int y1 = 5;
        Test obj = new Test(x2,y1);
        System.out.println(x2+" "+y1);
        System.out.println("#145");
        ArrayList<Cycle> myList = new ArrayList<Cycle>();
        myList.add(new MotorCyle());
        System.out.println();
        System.out.println("#147");
        Vehicule vehicule = new Car(20);
        System.out.println(vehicule);

        System.out.println("#148");
        LocalDate date = LocalDate.of(2012,1,30);
        date.plusDays(10);
        System.out.println(date);
        int t1 = 1;
        int t2 = 1;

        if (t1++ < ++t2){
            System.out.println("Hello "+t2);
        }else {
            System.out.println("Welcome ");
        }
        System.out.println("Log "+t1+" : "+t2);
        System.out.println();
        System.out.println("#151");
        String[] arr = {"A","B","C","D"};
        for (int c = 0; c < arr.length;c++){
            if (arr[c].equals("D")){
                System.out.println("Work done!");
                break;
            }
            continue;
        }

        System.out.println("#152");
        int wd = 0;
        String days[] = {"sun","mon","wed","sat"};
        for (String s:days){
            switch (s){
                case "sat":
                case "sun":
                    wd -=1;
                    break;
                case "mon":
                    wd -=1;
                    break;
                case "wed":
                    wd +=2;
            }
        }
        System.out.println(wd);
        System.out.println();
        System.out.println("#153");
        String[] arry = {"Hi","How","Are","You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arry));
        if (arrList.removeIf(s -> {
            System.out.println(s);
            return s.length() <= 2;
        })){
            System.out.println(" removed!!!");
        }
        System.out.println("#154");
        String[] strs = {"A","B"};
        int idx = 0;
        for (String s: strs){
            strs[idx].concat(" element "+ idx);
            idx++;
        }
        System.out.println(idx);
        for (idx = 0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }
        System.out.println("#155");
        A a = new A();
        System.out.println("#156");
        System.out.println();
        System.out.println("#157");
        String names[] = {"Thomas","Peter","Joseph"};
        String pwd[] = new String[3];

        int idx2 = 0;
        try {
            for(String n2:names){
                pwd[idx2] = n2.substring(2,6);
                System.out.println(pwd[idx2]);
                idx2++;
            }
        }catch(Exception e){
            System.out.println("Invalid Name");
        }
        System.out.println();
        System.out.println("#160");
        Employee employee =  new Employee();
        Employee manager = new Manager();
        Employee director = new Director();
        //ln1
        employee.salary = 50_00;
        director.salary = 80_000;
        manager.salary = 90_00;

        System.out.println("#161");
        Test.displayMsg();
        displayMsg();
        System.out.println();
        System.out.println("#162");
        C2 obj1 = new C1();
        I obj2 = new C1();

        C2 s = (C2) obj2;
        I t = obj1;

        t.displayI();
        s.displayC2();
        System.out.println("#163");
        int ii = 0;
        int jj = 7;

        for(ii = 0; ii < jj; ii = ii +2){
            System.out.print(ii+" ");
        }

    }
    //161
    public static void displayMsg(){
        System.out.println("Welcome Visit Count: "+count++);//line n1
    }
    //#144
    public Test(){}
    public Test(int x,int y){
        initialize(x,y);
    }
    public void initialize(int x, int y){
        this.x = x * x;
        this.y = y * y;
    }
}
