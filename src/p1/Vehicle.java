package p1;
//#7
public class Vehicle {
    String type = "4W";
    int maxSpeed = 100;

    Vehicle (String type, int maxSpeed){
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
    Vehicle(){} // si no existe error Car en ln 1
}
