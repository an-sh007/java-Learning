import java.util.Scanner;

public class swit{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char");
        char ch=sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " is not a vowel");
        }
    //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
    //         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
    //         System.out.println(ch + " is a vowel");
    //     } else {
    //         System.out.println(ch + " is not a vowel");
    //     }
    // }
    }
}
