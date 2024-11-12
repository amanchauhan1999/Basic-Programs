import java.util.Scanner;

public class simIntrest {
    public static void main(String[] args) {
        int p,r,t;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal,Rate and Time in years :");
        p = sc.nextInt();
        r=sc.nextInt();
        t= sc.nextInt();
        int amount = p*r*t/100;
        System.out.println("The intrest is :"+amount);
        System.out.println("The total amount is :"+(amount+p));
    }
}
