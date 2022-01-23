import java.util.Scanner;

public class Practice1dec21 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("input number");
        int input=a.nextInt();

        if (input>0)
        {
            System.out.println("number is positive");
        }
        else if (input<0)
        {
            System.out.println("number is negative");
        }
        else
        {
            System.out.println("number is zero");
        }

    }
}
