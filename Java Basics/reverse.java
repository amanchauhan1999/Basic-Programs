import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        long a ;
        System.out.println("Enter the number you want to reverse :");
        Scanner sc = new Scanner(System.in);
        a= sc.nextLong();

        while(a!=0){
            long b= a%10;
            System.out.print(b);
            a /= 10;
        }
    }
}
