public class MethodRule {
    public static void main(String[] args) {
        add(10, 19);
        subtraction(23, 12);
       int mul= multiply(3,23);
       System.out.println(mul);
       double dob= divide(50, 45);
       System.out.println("the division is "+dob);
    }
    public static int multiply(int a, int b) {
       
        return a*b; 
    }
    public static int add(int a, int b) {
        int result = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
        return result; 
    }
    public static int subtraction(int a, int b) {
        int result = a - b;
        System.out.println("The difference of " + a + " and " + b + " is: " + result);
        return result; 
    }
    public static double divide(double a, double b) {
       
        return a/b;

    }
    }
    

