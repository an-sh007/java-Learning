public class compiletime {
    public static void main(String[] args) {
        add('a');
        add(10);
        
    }

    public static void add(double d) {
        System.out.println("The value is: " + d);
    }

    public static void add(int a, int b) {
        int result = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }

   
    
}
