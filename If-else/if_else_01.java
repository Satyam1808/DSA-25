import java.util.Scanner;

public class if_else_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("The number "+num+" is even.");
        }else{
            System.out.println("The number "+num+" is odd.");
        }
    }
}
