package p2;

public class Car extends Vehicle {
    int y;
    /*
    * this(); tiene prioridad, debe colocarse en la parte superior del constructor, al igual que super();
    * no se deben usar en el mismo constructor ya que ambos requieren estar en la parte superior
    * como primer statement del constructor.
    * */
    Car(){
        super();
//        this(20); //ln2
        this.y = 20;
    }
    Car(int y){
        this.y = y;
    }

    @Override
    public String toString() {
        return super.x + " : " + this.y;
    }
}
