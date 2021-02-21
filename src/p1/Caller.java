package p1;

public class Caller {
     void init(){
        System.out.println("Initialized");
    }

     public void start(){
        init();
        System.out.println("Started");
    }
}
