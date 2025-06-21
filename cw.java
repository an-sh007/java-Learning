public class cw {
    public static void main(String[] args) {
       add(10,19);
       subtraction(23, 12);
        multiply();
        
        divide(50,45);
    }

    public static void multiply() {
        int a = 10;
        int b = 20;
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is: " + result);
    }

     public static void add(int a ,int b) {
        // int a = 10;
        // int b = 20;
        int result = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
     public static void subtraction(int a ,int b) {
        // int a = 10;
        // int b = 20;
        int result = a - b;
        System.out.println("The difference of " + a + " and " + b + " is: " + result);
    }
    public static void divide(double a ,double b) {
        // int a = 20;
        // int b = 10;

        if (b != 0) {
            double result = a / b;
            System.out.println("The division of " + a + " by " + b + " is: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
