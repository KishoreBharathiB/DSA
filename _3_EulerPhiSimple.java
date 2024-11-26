import java.util.Scanner;

public class _3_EulerPhiSimple {

   
    public static int phi(int n) {
        int result = 1; 
        
        for (int i = 2; i < n; i++) {
            if (gcd(i, n) == 1) {  
                result++; 
            }
        }
        
        return result;
    }

   
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int phi_n = phi(n);
        System.out.println("phi(" + n + ") = " + phi_n);
        sc.close();
    }
}
