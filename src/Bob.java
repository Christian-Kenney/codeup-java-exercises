import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to say to Bob?");
        String sentence = sc.nextLine();
        if(sentence.endsWith("!")){
            System.out.println("Bob said: Whoa, chill out!");
        }else if(sentence.endsWith("?")){
            System.out.println("Bob said: sure");
        }else if(sentence.equals("")){
            System.out.println("Bob said: Fine. Be that way!");
        }else{
            System.out.println("Bob said: whatever");
        }
    }
}
