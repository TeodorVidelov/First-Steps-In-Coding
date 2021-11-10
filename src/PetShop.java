import java.util.Scanner;
public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDogPackage = Integer.parseInt(scanner.nextLine());
        int countCatPackage = Integer.parseInt(scanner.nextLine());

        double priceDogFood = countDogPackage * 2.50;
        double priceCatFood = countCatPackage * 4.0;
        double sum = priceDogFood + priceCatFood;

        System.out.printf("%.1f lv.",sum);
    }
}