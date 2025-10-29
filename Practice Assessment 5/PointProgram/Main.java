import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = input.nextInt();

        System.out.print("Enter y: ");
        int y = input.nextInt();

        Point point = new Point(x, y);

        point.printCoordinates();
        System.out.printf("%.2f%n", point.calculateDistance());

        input.close();
    }
}
