import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = null;
        String[] products = {"Bread", "Apple", "Milk", "Pineapple", "Heroin"};
        int[] price = {48, 77, 89, 350, 500};
        int[] counterOfEachItem = new int[price.length];
        int productSum = 0;
        int productNumber = 0;

        while (true) {
            System.out.println("List of possible items to buy");
            showStoreProducts(products, price);

            System.out.println("\nSelect a product or enter `end`");
            input = reader.readLine();

            if (input.equals("end")) {
                System.out.println("Your shopping cart:");
                for (int i = 0; i < counterOfEachItem.length; i++) {
                    if (counterOfEachItem[i] != 0) {
                        System.out.println(products[i] + " " + counterOfEachItem[i] + " . " + price[i] + "$/PC. = " + (counterOfEachItem[i] * price[i]) + "$.");
                    }
                }
                System.out.println("Total: " + productSum + "$");
                break;
            }

            productNumber = Integer.parseInt(input);
            int priceOfTheSelectedProduct = price[productNumber-1];

            System.out.println("\nEnter item quantity or enter `end`");

            input = reader.readLine();
            counterOfEachItem[productNumber-1] += Integer.parseInt(input);
            productSum = priceOfTheSelectedProduct * Integer.parseInt(input);
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