package p1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
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
        System.out.println("7");
        Car c1 = new Car("Auto");
        Car c2 = new Car("4W", 150, "Manual");
        System.out.println(c1.type+" "+c1.maxSpeed+" "+ " "+c1.trans);
        System.out.println(c2.type+" "+c2.maxSpeed+" "+ " "+c2.trans);
    }
    //#1
    public void updatePrice(Product product, double price){
        price = price *2;
        product.price = product.price + price;
    }
    //#2
}
