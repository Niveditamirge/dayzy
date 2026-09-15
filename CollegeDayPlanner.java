import java.util.Scanner;

class CollegeDayPlanner {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your college data:");

        System.out.print("Number of assignments pending: ");
        int assignments = scanner.nextInt();

        System.out.print("Number of hours available: ");
        int hours = scanner.nextInt();

        System.out.print("Is an exam near? (1 = Yes, 2 = No): ");
        int exam = scanner.nextInt();

        if (exam == 1) {
            System.out.println("Tip: Revise important topics and learn keywords");
        }

        if (assignments > 2) {
            System.out.println("Tip: Complete your pending assignments");
        }

        if (hours < 3) {
            System.out.println("Tip: Focus on the most important work");
        }else{
            System.out.println("Tip: You have enough time. Complete your assignment and then relax.");
        }

   
    }
}