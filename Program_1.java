import java.util.Scanner;

class Program_1 {
    public static void operate(double a, double b, String op) {
        switch (op) {
            case "+":
                System.out.println("Addition" + (a + b));
                break;
            case "-":
                System.out.println("Substraction"+( a - b));
                break;
            case "*":
                System.out.println("Multiplication" +(a * b));
                break;
            case "/":
                if (b != 0){
                    System.out.println( a / b);
                    break;
                }
                else
                    System.out.println("Cannot divide by zero");
                    break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        String op = sc.next();
        operate(a, b, op);
    }
}
