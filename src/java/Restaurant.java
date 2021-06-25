import order.Order;
import table.Table;
import utils.FileHandler;


public class Restaurant {

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        fileHandler.readFile("Drinks.txt");
        fileHandler.readFile("Meals.txt");
        fileHandler.readFile("KitchenTools.txt");

        Order order = new Order("Coca-cola", 1);


        Table table = new Table(1, 4, false);
    }
}
