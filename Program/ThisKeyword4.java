//A java program to demonstrate use of this keyword 
//this keyword used for call a parameterized construstor of it's own class.
class Student{
    Student(){
        this(1010,"johan");
        System.out.println("welcome to Student Portal");
        
    }
    Student(int id,String Name){
        System.out.println("Student id="+id);
        System.out.println("Student name="+Name);
        
    }
}
class ThisKeyword4{
    public static void main(String args[]){
        Student std=new Student();
    }
}