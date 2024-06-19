class Student{
    int rollno;
    String name,College;
    Double marks,Attendence;
    Student(){
        rollno=101;
        name="muskan";
        College="Bansal";
        marks=345.0;
        Attendence=75.5;
    }
    void display(){
        System.out.println("Roll no.= " +rollno);
        System.out.println("Student name= " +name);
        System.out.println("Attendence= " +Attendence+ "%");
        System.out.println("marks= " +marks);

    }
}
class ContructorDefaultExample3{
    public static void main(String args[]){
        Student obj=new Student();
        obj.display();

    }
}