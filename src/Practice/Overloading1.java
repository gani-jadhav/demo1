package Practice;

public class Overloading1 { //methods overloading
    int a;
    int b;

    void action() {
        int a = 12;
        int b = 13;
        System.out.println(a + b);
    }

    void action(int x, int y) {
        int a = x;
        int b = y;
        System.out.println(x + y);

    }

    void action(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    void action(int x, double y) {
        System.out.println(x+y);
    }

    public static void main(String[] args) {


        Overloading1 object = new Overloading1();
        object.action();
        object.action(15,13);
        object.action(200,300);
        object.action(23,78.90);

    }
}
