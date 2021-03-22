package p4;

public class Rectangle {
    private double length;
    private double height;
    private double area;

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setArea() {
        this.area = this.length * this.height;
    }
}
