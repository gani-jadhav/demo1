import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner y= new Scanner(System.in);
        System.out.println("enter a number");
        int day=y.nextInt();
        switch (day) {

            case 1: {
                System.out.println("mon");
                break;
            }
            case 2: {
                System.out.println("tue");
                break;
            }
            case 3: {
                System.out.println("wed");
                break;
            }
            case 4: {
                System.out.println("thu");
                break;
            }
            case 5: {
                System.out.println("fri");
                break;
            }
            case 6: {
                System.out.println("sat");
                break;
            }
            case 7: {
                System.out.println("sun");
                break;
            }
            default:
                System.out.println("invalid entry");
        }
    }
}
