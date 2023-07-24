import java.util.*;
public class Count_prime {
    public static boolean prime(int n) {
        if (n == 0 || n == 1) {

            return false;
        }

            for (int i = 2; i < n; i++) {
                if (n % i== 0) {
                    return false;
                }
            }
            return true;


        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type n");
         int n=sc.nextInt();
         for (int i=2;i<n;i++)
         {
       if(prime(i)){
           System.out.println(i);
       }

    }}
}

