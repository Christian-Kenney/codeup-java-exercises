import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userInt, length, width, total;
        String word1, word2, word3, sentence;
        System.out.println("Please enter a number");
        userInt = sc.nextInt();
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
        length = sc.nextInt();
        System.out.println("What is the width of the class room?");
        width = sc.nextInt();
        total = (length * 2) + (width * 2);
        System.out.println("The total perimeter is: " + total);

    }
}
