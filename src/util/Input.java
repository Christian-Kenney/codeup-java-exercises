package util;
import java.util.Scanner;

public class Input {
private Scanner sc = new Scanner(System.in);

public String getString(){
    System.out.println("Enter a string");
    String userInput = sc.next();
    return userInput;
}
public boolean yesNo(){
    System.out.println("Enter 'Y' or 'N'");
    String userInput = sc.next();
    if(userInput.equals("Y") || userInput.equals("Yes")){
        return true;
    }else{
        return false;
    }

}
public int getInt(int num1, int num2){
    System.out.println("Enter a number between " + num1 + " and " + num2);
    int userInput = sc.nextInt();
    boolean correct = true;
    while(correct) {
        if (userInput > num1 && userInput < num2) {
            correct = false;
        }else{
            System.out.println("Try again");
            userInput = sc.nextInt();
        }
    }
    return userInput;
}

    public double getDouble(double num1, double num2){
        System.out.println("Enter a number between " + num1 + " and " + num2);
        double userInput = sc.nextDouble();
        boolean correct = true;
        while(correct) {
            if (userInput > num1 && userInput < num2) {
                correct = false;
            }else{
                System.out.println("Try again");
                userInput = sc.nextDouble();
            }
        }
        return userInput;
    }
    public double getRadius(){
    System.out.println("Enter the radius");
    return sc.nextDouble();
    }

}

