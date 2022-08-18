import java.util.Scanner;

public class Sum_of_Digits_of_a_Num {
    int n,r,sum=0;
        System.out.println("Enter a Number");
        Scanner r = new Scanner (System.in);
        n =r.nextInt();

        while(n>0);{
            r=n%10;
            sum=sum+r;
            n=n/10;

            System.out.println("Sum of Digits "+ sum);
        }

}
