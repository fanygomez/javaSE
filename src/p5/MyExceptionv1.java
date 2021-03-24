package p5;

import java.io.IOException;

class MyException extends RuntimeException {}
public class MyExceptionv1 {
    public static void main(String[] args) {
        System.out.println("#157");
        try {
            method1();
        }catch(MyException ne){
            System.out.println("A");
        }
    }
    public static void method1(){//ln1
        try{
            throw 3 > 10? new MyException() : new IOException();
        }catch(IOException ie){
            System.out.println("I");
        }catch(Exception re){
            System.out.println("B");
        }
    }
}
