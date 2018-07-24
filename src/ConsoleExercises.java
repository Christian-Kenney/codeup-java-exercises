import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double userInt, length, width, total;
        String word1, word2, word3, sentence;
        System.out.println("Please enter a number");
        userInt = sc.nextDouble();
        System.out.println(userInt);
        System.out.println("Please enter 3 words");
        word1 = sc.next();
        word2 = sc.next();
        word3 = sc.next();
        System.out.println(word1 + "\n" + word2 + "\n" + word3);
        System.out.println("Please enter a sentence");
        sentence = sc.nextLine();
        System.out.println(sentence);
        System.out.println("What is the length of the class room?");
        length = sc.nextDouble();
        System.out.println("What is the width of the class room?");
        width = sc.nextDouble();
        total = (length * 2) + (width * 2);
        System.out.println("The total perimeter is: " + total);
        double volume = length * width;
        System.out.println("The total volume is: " + volume);

    }
}
