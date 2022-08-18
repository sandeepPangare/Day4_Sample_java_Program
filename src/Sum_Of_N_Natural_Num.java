import java.util.Scanner;

public class Sum_Of_N_Natural_Num {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter No. of Term to Find");
        Scanner r = new Scanner (System.in);
        n =r.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println(i + "");
        }
    }
}

