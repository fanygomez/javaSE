package p2;
//#68
public class Triangle {
    static double area;
    int b = 2,  h = 3;
    public static void main(String[] args) {
        double p, b, h; //ln1

        if (area == 0){
            b = 3;
            h = 4;
            p = 0.5;
            area = p * b * h; //ln2
        }

        System.out.println("Area is "+ area);
    }
}
