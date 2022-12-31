import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombresList = new ArrayList<String>();
        String[] nombres = {"H", "e", "ll", "o"};
        for (String string: nombres) {
            nombresList.add(string);
        }
        System.out.println(Arrays.toString(nombres));
    }
}