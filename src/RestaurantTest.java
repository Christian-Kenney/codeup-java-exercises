public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.setCostInCents(300);
        dish.setNameOfDish("pasta");
        dish.setWouldRecommend(true);
        dish.getCostInCents();
        dish.getNameOfDish();
        dish.getWouldRecommend();
        dish.eat();
//        RestaurantDish steak = new RestaurantDish("Steak", false);
//        dish.Student(1500, "Steak", false);
//        System.out.println(steak);
    }

}
