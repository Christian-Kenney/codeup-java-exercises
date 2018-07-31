import java.util.*;


public class ServerNameGenerator {

    public static String getAdjective(int number){
        String[] adjectives = {"warm", "fat", "bland", "Minty", "fluffy", "hot", "cold", "soft", "hard", "dry"};
        return adjectives[number];
    }
    public static String getNoun(int number){
        String[] nouns = {"house", "light", "book", "cat", "dog", "bird", "horse", "breakfast", "lunch", "dinner"};
        return nouns[number];
    }
    public static void main(String[] args){
        Random rand = new Random();
        int adjecNum = rand.nextInt(10);
        int nounNum = rand.nextInt(10);
        String adjec = getAdjective(adjecNum);
        String noun = getNoun(nounNum);
        System.out.println("Here is your server name: ");
        System.out.println(adjec + "-" + noun);

    }
}
