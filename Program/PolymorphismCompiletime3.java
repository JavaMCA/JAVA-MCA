//By changing sequence of Argument
class Student {
    void studentId(String name,int roll){
        System.out.println("Student Name: "+name);
        System.out.println("Student roll no.: "+roll);
    }
    void studentId(int roll,String name){
        System.out.println("Student Name: "+name);
        System.out.println("Student roll no.: "+roll);
    }
}
class PolymorphismCompiletime3{
    public static void main(String args[]){
        Student obj=new Student();
        obj.studentId("johan",1001);
        obj.studentId(1005,"rohan");
    }
}