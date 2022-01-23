package Practice;



public class ReturnTypeTest1 {
    int add() {
        int a = 12;
        int b = 13;
        int y = a + b;
        return y;
    }

    public static void main(String[] args) {
        ReturnTypeTest1 test=new ReturnTypeTest1();
        int add=test.add();
        System.out.println("sum of a and b is: "+add);
        
    }
}
