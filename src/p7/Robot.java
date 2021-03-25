package p7;

abstract class Robot  implements  Speakable{
    public abstract  void process();
}

class Humanoid  extends Robot{
    public void speak(String s){
        System.out.println(s);
    }

    public void process(){
        System.out.println("Helping...");
    }
}
interface Speakable{
    public void speak(String s);
}