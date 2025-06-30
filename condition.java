import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        // int a = 90;
        

        if (a >=90) {
            System.out.println("Excellent");
        } else if (a >= 75 && a < 90) {
            System.out.println("Very Good");
        } 
        else if (a >= 60 && a < 75) {
            System.out.println("average");
        }
        else {
            System.out.println("fail");
        }
    }
    
}
