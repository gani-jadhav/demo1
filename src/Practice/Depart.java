
  class Depart {
    int num1=12;
    int num2=13;
    int num3=num1+num2;

    void collection(){
        System.out.println(num3);
    }
}
class Test{
    public static void main(String[] args) {
        Depart result = new Depart();
        result.collection();

    }
}
