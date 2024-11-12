import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hit 1 if you want to change celcius into farenheit\n");
        System.out.println("Hit 2 if you want to change farenheit into celcius\n");
        a=sc.nextInt();
        System.out.println("Enter the data you want to change :");
        float input,f,c;
        input = sc.nextFloat();

        switch (a){
            case 1:
                f = (float) ((input*1.8)+32);
                System.out.println(f);
                break;
            case 2:
                c = (float) ((input-32)*0.55);
                System.out.println(c);
                break;
            default:
                System.out.println("Hit the valid option !!!");
        }

    }
}
