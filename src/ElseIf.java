public class ElseIf {
    public static void main(String[] args) {
        int a=500;
        int b=100;
        int c=400;

           if((a>b)&&(a>c)) {
               System.out.println("a is greater than b and c");
           }
               else if ((b > a) && (b > c)) {
                   System.out.println("b is greater than a and c");
               }
               else
               {
                   System.out.println("c is greater than a and b");

               }



    }
}
