package Practice;

public class ReturnValuesInMethod {
   /* static int value(int x){
        return (x+5);
    }

    public static void main(String[] args) {

        System.out.println(value(3));
        System.out.println(value(12));
    }
// 2nd example
   static double name(double x,double y){
       return x+y;
   }

    public static void main(String[] args) {


       System.out.println(name(12.2,13.9));
        System.out.println(name(1566.9,1233.89));


    }

    // 3rd example

    static int mymethod(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        int z=mymethod(12,14);
        System.out.println(z);
         z=mymethod(1222,3443);
        System.out.println(z);
         z=mymethod(12222,13333);
        System.out.println(z);
    } */

    //4th example to using if .....else

    static int method(int age) {


        if (age < 18) {
            System.out.println("Access Denied");
        } else {
            System.out.println("Access granted");
        }
        return age;

    }

    public static void main(String[] args) {
        method(34);
        method(145);

    }
}

