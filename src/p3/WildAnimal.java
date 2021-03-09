package p3;

public class WildAnimal extends Animal{
    String bounds;

    WildAnimal(String bounds){
        super();// ln1
        this.bounds = bounds;
    }
    WildAnimal(String type, int maxSpeed,String bounds){
//        //ln2
        super(type,maxSpeed);
        this.bounds = bounds;
        //or
//        super(type,maxSpeed);
//        this.bounds = bounds;
    }
}
