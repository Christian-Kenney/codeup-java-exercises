package movies;
import java.util.*;


public class MoviesApplication {
    public static void main(String[] args){
        MoviesArray movieArray = new MoviesArray();
       Movie[] movies = movieArray.findAll();
       Scanner sc = new Scanner(System.in);
        boolean userCont = true;
        while(userCont) {
            System.out.println("What would you like to do? \n");
            System.out.println("0 - Exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category ");
            System.out.println("6 - add your own movie \n");
            int userChoice = sc.nextInt();
            if (userChoice == 0) {
                userCont = false;
            }
            if (userChoice == 1) {
                for (int i = 0; i < movies.length; i++) {
                    System.out.println("name: " + movies[i].getName() + "  Category: " + movies[i].getCategory());
                }
            }
            if (userChoice == 2) {
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equals("animated")) {
                        System.out.println("name: " + movies[i].getName() + "  Category: " + movies[i].getCategory());
                    }
                }
            }
            if (userChoice == 3) {
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equals("drama")) {
                        System.out.println("name: " + movies[i].getName() + "  Category: " + movies[i].getCategory());
                    }
                }
            }
            if (userChoice == 4) {
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equals("horror")) {
                        System.out.println("name: " + movies[i].getName() + "  Category: " + movies[i].getCategory());
                    }
                }
            }
            if (userChoice == 5) {
                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getCategory().equals("scifi")) {
                        System.out.println("name: " + movies[i].getName() + "  Category: " + movies[i].getCategory());
                    }
                }
            }
            if (userChoice == 6){
                System.out.println("What is the name of the movie?: ");
                String userName = sc.next();
                System.out.println("What is the genre of the movie?: ");
                String userGenre = sc.next();
                int length = movies.length;
                System.out.println(length);
                System.out.println(movies[length]);
//                movies[length].setName(userName);
//                movies[length - 1].setCategory(userGenre);
            }

        }
    }
}
