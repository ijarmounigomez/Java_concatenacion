import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Option number 1 - using forEach loop
        String[] string1 = {"H", "e", "ll", "o"};
        for (String string : string1) {
            System.out.print(string);
        }

        System.out.println("\n"); // Space line between both

        // Option number 2 - using for loop
        String[] string2 = {"Texto 1", "Texto 2", "Texto 3"};
        for (int i = 0; i < string2.length; i++) {
            System.out.print(string2[i]);
        }
    }
}