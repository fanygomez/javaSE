package p6;

import java.sql.SQLOutput;

public class Game {
    public static void menu(){
        System.out.println("1. left 2. Right 0. Stop");
    }

    public static void main(String[] args) {
        int option = 0;
        do {
            menu();
        }while (option != 0);
    }
}
