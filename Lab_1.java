import java.util.Scanner;
public class Lab_1 {
    public static void main(String[] args){

        System.out.printf("C2 = %d\n",1532%2);
        System.out.printf("C3 = %d\n",1532%3);
        System.out.printf("C5 = %d\n",1532%5);
        System.out.printf("C7 = %d\n",1532%7);

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a:");
        double a = sc.nextDouble();
        System.out.print("Input n:");
        double n = sc.nextDouble();
        System.out.print("Input b:");
        double b = sc.nextDouble();
        System.out.print("Input m:");
        double m = sc.nextDouble();

        double c = 2;
        double res = 0;

        if (a > n || b > m){
            System.out.println("The lower limit is greater than upper limit");
            System.exit(0);
        }

        for(double i = a; i<=n; i++) {
            if (i == -c) {
                System.out.print("Division by 0");
                System.exit(0);
            }
                for (double j = b; j <= m; j++) {
                    if (j == 0) {
                        System.out.print("Division by 0");
                        System.exit(0);
                    }
                    res += (i % j) / (i + c);

            }
        }
        System.out.println(res);
    }
}
