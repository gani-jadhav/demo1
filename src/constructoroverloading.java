import java.sql.SQLOutput;

public class constructoroverloading {
    int a=0;
    int b=0;
    double c=0;
    constructoroverloading(){
        a=12;
        b=13;
    }
    constructoroverloading(int a,int b){
        this.a=a;
        this.b=b;
    }
    constructoroverloading(int a,double b){
        this.a=a;
        this.c=b;
    }
    constructoroverloading(int a,int b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        //constructoroverloading co=new constructoroverloading();
        //constructoroverloading co=new constructoroverloading(13,14);
        //constructoroverloading co=new constructoroverloading(14,34.7);
        constructoroverloading co=new constructoroverloading(12,12,13.1);
        co.display();
    }
}
