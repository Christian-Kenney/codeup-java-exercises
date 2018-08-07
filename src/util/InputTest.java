package util;
//import java.util.*;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();
        String userInput = test.getString();
        boolean userBoo = test.yesNo();
//        int userInt = test.getInt(2, 9);
        double userDub = test.getDouble(1.5, 8.5);
        System.out.println(userInput);
        System.out.println(userBoo);
//        System.out.println(userInt);
        System.out.println(userDub);

    }
}
