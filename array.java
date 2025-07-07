import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int [] a = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            
            a[i] = sc.nextInt();
            System.out.println(a);
        }
         System.out.println(a);
        
        // a[0] = 10;
        // a[1] = 20;
        // a[2] = 30;
        // a[3] = 40;
        // a[4] = 50;
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);
        // int b[] = {10, 20, 30, 40, 50};
        // System.out.println("the fetched value i " +b[0]);
        // System.out.println(b[1]);
        // System.out.println(b[2]);
    //     for (int i = 0; i < b.length; i++) {
    //         System.out.println("in loop   :" +b[i]);
    //     }
    }
}
