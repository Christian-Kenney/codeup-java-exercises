import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        long i = 1;
//        while(i < 100){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//                i++;
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//                i++;
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//                i++;
//            }else{
//                System.out.println(i);
//                i++;
//            }
//        }
//        System.out.print("What number do you want to go up to? ");
//        int userNum = sc.nextInt();
//        System.out.println("Here is your table! \n");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for(var x = 1; x <= userNum; x++){
//            int squared = (x * x);
//            int cubed = (x * x * x);
//            System.out.println(x + "      | " + squared + "       | " + cubed);
//        }

        boolean answer = true;
        while(answer){
            System.out.print("What is the grade? ");
            int grade = sc.nextInt();
            if(grade >= 90){
                System.out.println("You recieved a A");
            }else if(grade < 90 && grade >= 80 ){
                System.out.println("You recieved a B");
            }else if(grade < 80 && grade >= 70){
                System.out.println("You recieved a C");
            }else if(grade < 70 && grade >= 60){
                System.out.println("You recieved a D");
            }else{
                System.out.println("You recieved a F");
            }
            System.out.println("Do you want to enter another grade? Y or N?");
            String response = sc.next();
            answer = response.equalsIgnoreCase("y");
//            if(response.charAt(0) != 'Y'){
//                answer = false;
//            }
        }

    }
}
