public class Ganesh
    {
        int a;
        int b;
        int c;
        void demo()
        {
            c=a+b;
        }
    }
    class SAD{
        public static void main(String[]args) {
            Ganesh r = new Ganesh();
            r.a = 2;
            r.b = 3;
            r.demo();
            System.out.println(r.c);

        }

        }
