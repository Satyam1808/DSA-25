package Basic;

public class basic_06 {
    public static void main(String[] args){
        int a= 3;
        int b = 5;

        int temp = a;
        a=b;
        b=temp;

        System.out.println("after swap:"+ a+" "+ temp);
    }
}
