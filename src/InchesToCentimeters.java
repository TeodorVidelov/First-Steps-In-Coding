import java.util.Scanner;
public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());

        System.out.print(inches * 2.54);
    }
}