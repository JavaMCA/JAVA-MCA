//Implicit default Constructor
//A java program that shows default constructor automatic initialize
// all instance variable to default values that type of constructor called
class Student{
    int rollno;
    String name,College;
    Double marks,Attendence;
    
    void display(){
        System.out.println("Roll no.= " +rollno);
        System.out.println("Student name= " +name);
        System.out.println("Attendence= " +Attendence+ "%");
        System.out.println("marks= " +marks);

    }
}
class ConstructorDefault{
    public static void main(String args[]){
        Student obj=new Student();
        obj.display();

    }
}