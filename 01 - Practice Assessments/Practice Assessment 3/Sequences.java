import java.util.Scanner;

public class Sequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first 5 elements of the sequence: ");
        int[] seq = new int[5];
        for (int i = 0; i < 5; i++) {
            seq[i] = sc.nextInt();
        }

        boolean isArithmetic = true;
        boolean isGeometric = true;

        int diff = seq[1] - seq[0];
        double ratio = (seq[0] != 0) ? (double) seq[1] / seq[0] : 0;

        for (int i = 0; i < 4; i++) {
            if (seq[i+1] - seq[i] != diff) {
                isArithmetic = false;
                break;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (seq[i] == 0 || (double) seq[i+1] / seq[i] != ratio) {
                isGeometric = false;
                break;
            }
        }

        if (isArithmetic) {
            System.out.print("Find which element: ");
            int n = sc.nextInt();
            int term = seq[0] + (n - 1) * diff;
            System.out.println("Element " + n + " is " + term);
        } else if (isGeometric) {
            System.out.print("Find which element: ");
            int n = sc.nextInt();
            double term = seq[0] * Math.pow(ratio, n - 1);
            if (term == (int) term) {
                System.out.println("Element " + n + " is " + (int) term);
            } else {
                System.out.println("Element " + n + " is " + term);
            }
        } else {
            System.out.println("The sequence is neither arithmetic nor geometric.");
        }

        sc.close();
    }
}