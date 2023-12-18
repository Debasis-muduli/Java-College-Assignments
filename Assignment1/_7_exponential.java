import java.util.*;

public class _7_exponential {
    static double fact(int n) {
        int facto=1;
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            for (int i = 1; i <= n; i++) {
                facto = facto * i;
            }
        }
        return facto;
    }

    static double power(double x,int n) {
        double pow=1;
        if (n == 0) {
            pow = 1;
            return pow;
        } else {
            for (int i = 1; i <= n; i++) {
                pow = pow * x;
            }
            return pow;
        }

    }

    public static void main(String[] args){
        int n;
        double x,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of terms:");
        n=sc.nextInt();
        System.out.println("Enter the value of X:");
        x=sc.nextDouble();
        for(int i=0;i<n;i++){
            sum=sum+(power(x,i)/fact(i));
        }
        System.out.printf("%.2f",sum);
    }
}
