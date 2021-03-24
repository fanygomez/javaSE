package p5;

public class Car extends Vehicule{
    int y;
    Car(){
        super(10);//ln2
    }
    Car(int y){
        super(y);
        this.y = y;
    }

    public String toString(){
        return super.x+" : "+this.y;
    }
}
