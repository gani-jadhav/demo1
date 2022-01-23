package Practice;

public class MyCarObject {
    public void Limit(){
        System.out.println("Car run as fast as possible ");
    }
    public  void Speed(int max_speed){
        System.out.println("car speed is "+max_speed);

    }

    public static void main(String[] args) {
        MyCarObject Fuel=new MyCarObject();
        Fuel.Limit();
        MyCarObject Capacity=new MyCarObject();
        Capacity.Speed(300);



    }

}
