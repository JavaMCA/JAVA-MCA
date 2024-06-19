//Example ofmDEfault constructor that displays the default values
class Student{
    int rollno;
    String name;
    Student(){
        System.out.println(rollno+ "  "+name);
    }
}
class ConstructorDefaultExample{
    public static void main(String args[]){
        Student ob=new Student();
    }
}