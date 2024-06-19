//java program to demonstrate haaving the main method in another class
class Student{
    int roll;
    float marks,percentage;
    void showResult(){
        percentage=marks/5;
        System.out.println("percentage=" +percentage);
        if(percentage>33){
            System.out.println("PASS");

        }
        else{
            System.out.println("FAIL");
        }
    }
}
class ClassExample3{
    public static void main(String args[]){
        Student obj=new Student();
        obj.marks=199;
        obj.showResult();
    }
}