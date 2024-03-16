package ryanlabs;



import java.util.Scanner;
  

public class Maabada1Ex2 {

	

    public static boolean istheShippingFree(int numProducts, double pricePerProduct) {
        double totalAmount = numProducts * pricePerProduct;
        return totalAmount > 150;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCustomers = 850;
        int customersWithShippingFees = 0;

        for (int i = 1; i <= numCustomers; i++) {
            System.out.println("Customer " + i + ":");
            System.out.print("Enter the number of products ordered: ");
            int numProducts = scanner.nextInt();
            System.out.print("Enter the price per product: ");
            double pricePerProduct = scanner.nextDouble();

            boolean shippingFree = istheShippingFree(numProducts, pricePerProduct);

            if (!shippingFree) {
                customersWithShippingFees++;
            }
        }

        scanner.close();

        System.out.println("Number of customers who have to pay shipping fees: " + customersWithShippingFees);
    }
}