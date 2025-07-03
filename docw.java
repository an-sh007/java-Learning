import java.util.Scanner;

public class docw {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.print("welcome");

            System.out.print(" \nEnter the charaacter (y/n): ");
            ch = sc.next().charAt(0); 

            if (ch == 'y') {
                System.out.println("Welcome!");
            } else if (ch == 'n') {
                System.out.println("You entered n");
            } else {
                System.out.println("Invalid input");
            }

        } while (ch != 'n'); 

        sc.close();
    }
}
