//A java program demonstrate use of single inheritance
class Student{
    String name="johan";
    int RollNo=1011;
    String DOB="11/12/99";
    void ShowDetails(){
        System.out.println("Name="+name);
        System.out.println("DOB="+DOB);
        System.out.println("Roll number="+RollNo);
    }
}
class Result extends Student{
    int marks=404;
    float per=marks/5;
       void Showresult(){
            System.out.println("Student Name="+name);
            System.out.println("Roll no="+RollNo);
            System.out.println("DOB="+DOB);
            System.out.println("Percentage="+per);
            if(per>=33){
                System.out.println("Result Status=Pass");
            }
            else{
                System.out.println("Result Status=FAIL");
            }
        }
}
class InheritanceSingle1{
    public static void main(String args[]){
        Result obj=new Result();
        obj.Showresult();
    }
}