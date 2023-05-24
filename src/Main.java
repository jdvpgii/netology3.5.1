import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] productName = {"Bread", "Apple", "Milk", "Pineapple", "Heroin"};
        int[] price = {48, 77, 89, 350, 500};
        Basket basket1 = new Basket(productName, price);

        while (true) {
            System.out.println("List of possible items to buy");
            showStoreProducts(productName, price);

            System.out.println("\nSelect a product or enter `end`");
            String productNumber = reader.readLine();
            if (productNumber.equals("end")) {
                basket1.printCart();
                break;
            }

            System.out.println("\nEnter item quantity or enter `end`");
            String productCounter = reader.readLine();
            if (productCounter.equals("end")) {
                basket1.printCart();
                break;
            }

            basket1.addToCart(Integer.parseInt(productNumber)-1, Integer.parseInt(productCounter));
        }

    }

    private static void showStoreProducts(String[] strings, int[] price) {
        int x = 1;
        for (String str : strings) {
            System.out.println(x + ". " + str + " " + price[x-1] + "$/PC.");
            x++;
        }
    }
}