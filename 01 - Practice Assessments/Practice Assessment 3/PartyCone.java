import java.util.Scanner;

public class PartyCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diameter of the cone's base: ");
        double diameter = sc.nextDouble();

        System.out.print("Height of the cone: ");
        double height = sc.nextDouble();

        double r = diameter / 2;
        double slantHeight = Math.sqrt(height * height + r * r);

        double surfaceArea = Math.PI * r * (r + slantHeight);
        double volume = Math.PI * r * r * (height / 3);

        System.out.printf("Surface Area is %.4f\n", surfaceArea);
        System.out.printf("Volume is %.4f\n", volume);

        sc.close();
    }
}
