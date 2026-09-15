import java.util.Scanner;

public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    int screenTime = scanner.nextInt();

    if(screenTime <= 2){
        System.out.println("low");
    }else if (screenTime == 4){
        System.out.println("Moderate");
    }else if (screenTime == 8){
        System.out.println("High");
    }else{
        System.out.println("danger and need to get some rest");
    }
}