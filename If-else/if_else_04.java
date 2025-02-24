import java.util.Scanner;

public class if_else_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        float a = sc.nextFloat();
        System.out.println("Enter the value of b:");
        float b = sc.nextFloat();
        System.out.println("Enter the value of c:");
        float c = sc.nextFloat();

        float D = (b*b)- 4*a*c;
        if (D>0) {
            System.out.println("Roots are real and distinc.");
        }else if (D<0) {
            System.out.println("Roots are complex.");
        }else{
            System.out.println("Roots are real.");
        }
    }
}
