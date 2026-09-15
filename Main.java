import java.util.Scanner;

class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your mood:");
        System.out.println("1. Happy");
        System.out.println("2. Sad");
        System.out.println("3. Tired");
        System.out.println("4. Stressed");

        int mood = scanner.nextInt();

        if (mood == 1) {
            System.out.println("Do something that you enjoy");
        } else if (mood == 2) {
            System.out.println("Take some rest and do something comforting");
        } else if (mood == 3) {
            System.out.println("Take some rest");
        } else if (mood == 4) {
            System.out.println("Take some time to relax");
        } else {
            System.out.println("Invalid choice");
        }
    }
}