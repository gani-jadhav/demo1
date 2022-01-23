package Practice;

public class OverLoadingMethod {
    static int methodint(int x, int y){
        return x+y;
    }
    static double method_double(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
      int num1=methodint(12,12);
       double num2=method_double(12.5,13.2);
       System.out.println(num1);
        System.out.println(num2);
    }
}
