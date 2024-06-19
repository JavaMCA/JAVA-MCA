//A java program to demostrate use of copy constructor.
class Student{
    int rollno;
    double marks;
    Student(int rno,double m){
        rollno=rno;
        marks=m;
    }
    Student(Student d){
        rollno=d.rollno;
        marks=d.marks;
    }
    void display(){
        System.out.println(rollno);
        System.out.println(marks);
    }
}
class CopyConstructor{
    public static void main(String args[]){
         Student res=new Student(1021,415.0);
         res.display();
         Student obj2=new Student(res);
         obj2.display();
    }
}
