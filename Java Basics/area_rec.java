import java.util.Scanner;

public class area_rec {
    public static void main(String[] args) {
        int len,br;
        System.out.println("Enter the length and breadth :");
        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();
        br = sc.nextInt();

        System.out.println("Area of the rectangle is :"+len*br);
    }
}
