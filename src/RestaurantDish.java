public class RestaurantDish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    public void Student(int cost, String name, Boolean rec){
        costInCents = cost;
        nameOfDish = name;
        wouldRecommend = rec;
    }
//    public (String name, Boolean rec){
//        costInCents = 3000;
//        nameOfDish = name;
//        wouldRecommend = rec;
//    }
    public void setCostInCents(int cost){
        costInCents = cost;
    }
    public void setNameOfDish(String name){
        nameOfDish = name;
    }
    public void setWouldRecommend(boolean value){
        wouldRecommend = value;
    }
    public void getCostInCents(){
        System.out.println(costInCents);
    }
    public void getNameOfDish(){
        System.out.println(nameOfDish);
    }
    public void getWouldRecommend(){
        System.out.println(wouldRecommend);
    }

    public static void eat(){
        System.out.println("Nom nom nom!");
    }
}
