import java.util.Scanner;
public class YardGreeining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMetersForGreening = Double.parseDouble(scanner.nextLine());

        double priceGreening = squareMetersForGreening * 7.61 ;
        double discountPriceGreening = priceGreening * 0.18;
        double totalPrice = priceGreening - discountPriceGreening;

        System.out.println("The final price is: " + totalPrice + " lv.");
        System.out.println("The discount is: " + discountPriceGreening + " lv.");
    }
}