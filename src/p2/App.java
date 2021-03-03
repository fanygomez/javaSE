package p2;


public class App {
    public static void main(String[] args) {
        System.out.printf("#50");
        String str1 = "Java";
        String str2 = new String("java");
        //line n1

        if (str2.equals(str1.toLowerCase())){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
        System.out.println("#51");
        int[] arr = {1,2,3,4};
        int i =0;
//        do {
//            System.out.println(arr[i] +" ");
//            i++;
//        }while (i < arr.length + 1);

        System.out.println("#52");
        String[] strs = new String[2];
        int idx = 0;
//        java.lang.NullPointerException
//        for (String s: strs){
//            strs[idx].concat("Element "+ idx);
//        }
//
//        for (idx = 0;idx  < strs.length; idx++) {
//            System.out.println(strs[idx]);
//        }
        System.out.println("#53");
        Vehicle y = new Car();
        System.out.println(y);
        System.out.println("#54");
        System.out.println(" Hello "+ new StringBuilder("Java SE 8"));
        System.out.println("Hello "+ new MyString("Java SE 8"));

        System.out.println("#57");

        int  num[][] = new int[1][3];

        for (int ii = 0; ii < num.length; ii++) {
            for (int j = 0; j < num[ii].length; j++){
                num[ii][j] = 10;
                System.out.println(num[ii][j]);
            }
        }

        System.out.println("#58");
        Planet[] planes = {
                new Planet("Mercury",0),
                new Planet("Venus",1),
                new Planet("Earth",1),
                new Planet("Mars",2)
        };
        System.out.println(planes);
        System.out.println(planes[2].name);
        System.out.println(planes[2].moons);

        System.out.println("#59");
        System.out.println("#60");
        int[] intArr = {15,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        for (int j = 0; j < intArr.length; j++) {
            System.out.print(intArr[j]+" ");
        }
        System.out.println();
        System.out.println("#61");
        int[] intArry = {8,16,32,64,128};
        for(int x : intArry){
            System.out.print(x+" ");
        }
        System.out.println();

        for (int a = 0; a < intArry.length; a++) {
            System.out.print(intArry[a]+" ");
        }
        System.out.println();
        System.out.println("#64");
        int var1 = 200;
        System.out.println();
        System.out.println(doCalc(var1));
        System.out.println(" "+var1);

        System.out.println("#67");
        MarketList obj1 = new MarketList();//Se crea una instancia
        MarketList obj2 = obj1;
        MarketList obj3 = null;
        obj2.num = 60;
        MarketList.graceMarks(obj2);
        System.out.println("#68");
        System.out.println("#69");
        //ln1
//      byte c = 1;
//      short c = 1;
      Integer c = new Integer("1");
      //Los siguientes no aplican
//      String c = "1";
//      long c = 1;
//      double c =1;
        switch (c){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
        System.out.println();
        System.out.println("#70");
        Boolean[] bool = new Boolean[2];

        bool[0] = new Boolean(Boolean.parseBoolean("true"));
        bool[1] = new Boolean(null);

        System.out.println(bool[0] +" "+ bool[1]);

    }
    //#64
    static int doCalc(int var1){
        var1 = var1 * 2;
        return var1;
    }
}
