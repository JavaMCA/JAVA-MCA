//A java program to demonstrate use of class object concept
class ClassExample1{
    int student_id;
    String student_name;
    void display(){
        System.out.println("Student name="+ student_name);
        System.out.println("student id ="+student_id);

    }
    public static void main(String args[]){
        ClassExample1 obj=new ClassExample1();
        obj.student_id=67876;
        obj.student_name="nikita";
        obj.display();
    }
}