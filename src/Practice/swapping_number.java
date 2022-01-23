package Practice;

public class swapping_number {
    int x=10;
    int y=20;

    public static void main(String[] args) {
        swapping_number swap=new swapping_number();
        int t= swap.y;
        swap.y= swap.x;
        swap.x=t;
        System.out.println("value of x :"+ " " +swap.x);
        System.out.println("value of y :" +" "+swap.y);
    }
        }
