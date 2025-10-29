import java.util.Scanner;

public class EdenAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of grades: ");
        int n = sc.nextInt();

        int[] grades = new int[n];

        System.out.print("Enter grades: ");
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextInt();
        }

        String passed = "";
        String failed = "";

        int stellaStars = 0;
        int tonitrusBolts = 0;
        int passCounter = 0;

        for (int i = 0; i < n; i++) {
            int grade = grades[i];

            // Rounding rule
            if (grade >= 78) {
                int nextMultipleOf5 = ((grade / 5) + 1) * 5;
                if (nextMultipleOf5 - grade < 3) {
                    grade = nextMultipleOf5;
                }
            }
            if (grade >= 80) {
                passed += grade + " ";
                passCounter++;

                if (passCounter % 3 == 0) {
                    stellaStars++;
                }
            } else {
                failed += grade + " ";
                tonitrusBolts++;
            }
        }

        if (!passed.isEmpty()) {
            System.out.println("\nPassed: " + passed.trim());
        }

        if (!failed.isEmpty()) {
            System.out.println("Failed: " + failed.trim());
        }

        System.out.println("\nStella Stars: " + stellaStars);
        System.out.println("Tonitrus Bolts: " + tonitrusBolts);

        sc.close();
    }
}
