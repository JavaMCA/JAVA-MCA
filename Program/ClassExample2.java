//A java program to demonstrate use of class object concept
class ClassExample2{
    int marks;
    double per;
    void display_result(){
          per=marks/5;
        System.out.println("percentage: "+per+ "%");
        if(per>35){
            System.out.println("PASS");
        }else{
        System.out.println("FAIL");
        }
    }
    public static void main(String args[]){
        ClassExample2 obj=new ClassExample2();
        obj.marks=300;
        obj.display_result();
    }
}