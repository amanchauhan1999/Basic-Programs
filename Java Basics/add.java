import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers you want to add :");
        a=sc.nextInt();
        b=sc.nextInt();

        int c = a+b;
        System.out.println("The addition is : " + c);
    }
}
