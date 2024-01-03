import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOFWater("qwe", 123, 100));
        productList.add(new BottleOFWater("qwe", 200, 150));
        productList.add(new BottleOFWater("asd", 500, 1000));
        productList.add(new BottleOFWater("qaffwe", 123, 10));
        productList.add(new HotDrink("HotTea", 123, 100, 70));
        productList.add(new HotDrink("HotTea", 150, 100, 100));
        productList.add(new HotDrink("ColdTea", 70, 100, 15));
        productList.add(new HotDrink("Coffee", 150, 100, 90));
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        HotDrinkVendingMachine vendingMachine1 = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);
        vendingMachine1.initProduct(productList);
        System.out.println(vendingMachine.getProduct("qwe", 100));
        System.out.println(vendingMachine1.getProduct("HotTea", 100));
    }
}