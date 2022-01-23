package Practice;
class Employee {
    int empid;
    String emp_name;
    String emp_dept;
    int emp_salary;

    void Display()
    {
        System.out.println(empid);
        System.out.println(emp_name);
        System.out.println(emp_dept);
        System.out.println(emp_salary);
    }



public static void main(String[]args) {
    Employee emp1=new Employee();
     emp1.empid=102;
     emp1.emp_dept="Purchase";
     emp1.emp_salary=20000;
     emp1.emp_name="Ganesh";
     emp1.Display();

  }

}
