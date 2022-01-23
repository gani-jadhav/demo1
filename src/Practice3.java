import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number1");
        int num1=x.nextInt();
        System.out.println("enter a nuber2");
        int num2=x.nextInt();
        System.out.println("enter a number3");
        int num3=x.nextInt();
        if((num1>num2)&&(num1>num3))
        {
            System.out.println("num1 is greater than num2 and num3 "+num1);
        }
        else if((num2>num1)&&(num2>num3))
        {
            System.out.println("num2 is greater than num1 and num3 "+num2);
        }
        else
        {
            System.out.println("num3 is greater "+num3);
        }
    }
}
