package p7;
class Book {
    int pages;
}
public class App2 {
    int count;

    public void method(Book x, int k){
        x.pages = 100;
        k = 200;
    }
}
