//
import java.util.Scanner;
class Employee{
    int EmpId;
    String EmpName;
    double Salary;
    String EmailId;
    Employee(int id,String name,double sal,String email){
        EmpId=id;
        EmpName=name;
        Salary=sal;
        EmailId=email;
    }
    Employee(int id,String name,double sal){
        EmpId=id;
        EmpName=name;
        Salary=sal;
    }

    Employee(int id,String name){
        EmpId=id;
        EmpName=name;
       
    }
   void showEmpDetails(){
        System.out.println("employee ID="+EmpId);
        System.out.println("Employee Name="+EmpName);
        System.out.println("Employee Salary="+Salary);
        System.out.println("Employee Eamail ID="+EmailId);

    }
}
class ConstructorOverloading2{
    public static void main(String args[]){
    Employee obj=new Employee(101,"xyz",15000.0,"abc@gamil.com");
    obj.showEmpDetails();
    
   /*  Employee obj1=new Employee(102,"abc",15000.0);
    obj1.showEmpDetails();
    }*/
}
