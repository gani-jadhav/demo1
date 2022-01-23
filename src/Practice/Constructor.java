package Practice;

public class Constructor {
    String emp_name;
    int emp_id;
    int emp_dep;
    int emp_salary;

    public Constructor(String name,int id,int dep,int sal){
        emp_name=name;
        emp_id=id;
        emp_dep=dep;
        emp_salary=sal;



    }
        void display()
        {
            System.out.println(emp_name);
            System.out.println(emp_id);
            System.out.println(emp_dep);
            System.out.println(emp_salary);
        }

    public static void main(String[] args) {
        Constructor emp1=new Constructor("Ganesh",10,23,20000);
        emp1.display();
    }
}
