//A java program to demonstrate use od this keyword 
//this keyword used for call a default construstor of it's own class.
class Student{
    Student(){
        System.out.println("welcome to Student Portal");
    }
    Student(int id,String Name){
        this();
        System.out.println("Student id="+id);
        System.out.println("Student name="+Name);
        
    }
}
class ThisKeyword3{
    public static void main(String args[]){
        Student std=new Student(1011,"johan");
    }
}