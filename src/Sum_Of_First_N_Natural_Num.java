import java.util.Scanner;

public class Sum_Of_First_N_Natural_Num {
    public static void main(String[] args) {
        int n , sum=0;
        System.out.println("Enter a Number");
        Scanner r = new Scanner (System.in);
        n =r.nextInt();

        for (int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println( "Addition is " +  sum );
    }
}
