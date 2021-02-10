package p1;
//#6
abstract class Planet {
    protected void resolve(){}  //ln1

    abstract void rotate(); //ln2
}

class Earth2 extends  Planet{

    public void resolve() {}
    public void rotate(){}
}