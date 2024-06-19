// A java program to Demonstrate use of parameterized constructor.
public class Student{
    int rollno;
    double marks;
    Student(int rno,double m){
        rollno=rno;
        marks=m;
    }
   public void display(){
        System.out.println("Roll no="+rollno);
        System.out.println("Marks="+marks);

    }
    }
class ConstructorParameterized{
    public static void main(String args[]){
        Student obj=new Student(101,412.0);
        obj.display();
        
    }
}