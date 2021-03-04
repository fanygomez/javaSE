package p3;

class Caller2 {
    private void init(){
        System.out.println("Initialized");
    }

    private void start(){
        init();
        System.out.println("Started...");
    }
}
