package array;
import java.util.ArrayList;


public class Array {
    public static void main(String[] args) {
        String[] car = {"BMW", "Mazda", "Mercedes", "Lexus", "Porsche"};
        for (int i = 0; i < car.length; i++) {
            System.out.println("ini adalah car ke-" + i + " = "+ car[i]);
        }
        
        ArrayList<String> food = new ArrayList<String>();
        food.add("Croffle");
        food.add("Cheese Cake");
        food.add("Taiyaki");
        food.add("Klepon");
        food.add("Surabi");
        System.out.println(food);
    } 
}
