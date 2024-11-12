import java.util.Scanner;

public class cmdIntrest {
    public static void main(String[] args) {
        float p,r,t;
        System.out.println("Enter the Principal,Rate and Time in years :");
        Scanner sc = new Scanner(System.in);
        p = sc.nextFloat();
        r = sc.nextFloat();
        t = sc.nextFloat();

        float amount = (float) (p*Math.pow(1+r,t));

        System.out.println("The amount is :"+amount);

    }
}
