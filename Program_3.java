import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;
        for (int i = 1; i <= count * 2; i += 2) {
            System.out.print(i+ " ");
    }
}
}
