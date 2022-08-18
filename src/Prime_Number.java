import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.println("Enter a Number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2){
            System.out.println("enter number is prime");
        }
        else {
            System.out.println("enter number is not prime");
        }


    }
}
