package p1;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("#1");
        Product prt = new Product();
        prt.price = 200;
        double  newPrice = 100;
        Test t = new Test();
        t.updatePrice(prt,newPrice);
        System.out.println(prt.price+" : "+newPrice);

        System.out.println("#2");
        Integer aVar =9;
        if (aVar++ < 10){
            System.out.println(aVar+" Hello world!");
        }else {
            System.out.println(aVar+" Hello Universe!");
        }
        System.out.println("#3");
        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);
        System.out.println("#4");
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 +s2;    //line n1
//        String s4 = (String) (s3 * s2); //n2 Error
//        System.out.println("Sum is "+s4);
        System.out.println("#7");
        Car c1 = new Car("Auto");
        Car c2 = new Car("4W", 150, "Manual");
        System.out.println(c1.type+" "+c1.maxSpeed+" "+ " "+c1.trans);
        System.out.println(c2.type+" "+c2.maxSpeed+" "+ " "+c2.trans);
        System.out.println();
        System.out.println("#8");
        Caller c = new Caller();
        c.start();//ln1 start()' has private access in 'p1.Caller
        c.init();//ln2 init()' has private access in 'p1.Caller
        System.out.println();
        System.out.println("#9");
        Customer customer = new Customer();
        customer.useElectricity(-1);
        System.out.println();
        System.out.println("#10");
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        if (sb.toString().equals(s.toString())){
            System.out.println("Math 1");
        }else if (sb.equals(s)){
            System.out.println("Math 2");
        }else{
            System.out.println("No Match");
        }
        System.out.println();
        System.out.println("#11");
        Book book = new Ebook();
        book.readBook();
        book.setBootMark();
        System.out.println();
        System.out.println("#12");
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);// Se concat C
        ta.replace('C','D');//No assignation
        ta = ta.concat(tb);// se concat C
        System.out.println(ta);
        System.out.println();
        System.out.println("#13");
        DVD dvd = new DVD(10,20);

        System.out.println();
        System.out.println("#14");
        int a[] = {1,2,3,4,5};
        for (int e = 0; e < 5; e+=2) {
            System.out.print(a[e]);
        }
        System.out.println();
        System.out.println("#17");
        CheckingAccount acct = new CheckingAccount((int) (Math.random() * 1000));
//        acct.amount = 0;
//        acct.setAmount(0);
//        acct.changeAmount(-acct.amount);
        acct.changeAmount(-acct.getAmount());
        System.out.println(acct.getAmount());
        System.out.println();
        System.out.println("#18");
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";
        //C
        for (String [] x : shirts) {
            for (String y : x){
                System.out.print(y+":");
            }
        }
        System.out.println();
        System.out.println("otro opcion");
        System.out.println();
        for (int index = 0; index < 2;) {
            for (int idx = 0; idx < 2;) {
                System.out.print(shirts[index][idx]+ ":");
                idx++;
            }
            index++;
        }
        System.out.println();
        System.out.println("#19");
        Test ex = new Test();
        int cardNo = 12344;
        ex.readCard(cardNo);//line 2
        ex.checkCard(cardNo); //line 3
        System.out.println("#20");
        int x = 5;
        while (isAvailable(x)){
            System.out.print(x);
            --x;
        }
        System.out.println();
        System.out.println("#21");
        String opt = "true";
        switch (opt){
            case "true":
                System.out.print("True");
                break;
            default:
                System.out.print("***");
        }
        System.out.println("Done");
        System.out.println();
        System.out.println("#22");
    int num = 5;
    do {
        System.out.println(num-- +" ");
    }while (num == 0);
    }
    //#20
    public static boolean isAvailable(int x){
        return x-- > 0 ? true : false;
    }
    //#19
    public void readCard(int cardNo) throws Exception{
        System.out.println("Reading Card...");
    }
    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("Checking Card...");
    }
    //#1
    public void updatePrice(Product product, double price){
        price = price *2;
        product.price = product.price + price;
    }
    //#2
}
