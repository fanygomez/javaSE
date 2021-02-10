package p1;

public class Car  extends Vehicle{
    String trans;
    Car(String trans){// line n1
        //super();
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans){
        super(type,maxSpeed); //lin 2
        this.trans = trans; //2 lz
    }
}
