package p3;

public class MyField {
    int x;
    int y;

    public void doStuff(int x,int y){
        x = x;
        y = this.y;
    }

    public void display(){
        System.out.println(x +" "+y+" : ");
    }
}
