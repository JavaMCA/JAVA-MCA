//java program for multilevel inheritance
class Student{
    int rollno=1001;
    String name="jems";
    void display_info(){
        System.out.println("Student name="+name);
        System.out.println("Roll no."+rollno);

    }
}

class Sports extends Student{
    int score=10;
    void display_sport(){
        System.out.println("sport bonus="+score);
        
        
}
}
class Result extends Sports{
    int marks=415+score;
    float per=marks/5;
    void display_result(){
        System.out.println("percentage="+per);
    
    if(per>=33){
        System.out.println("PASS");
    }
    else{
        System.out.println("FAIL");
    }
}
}
class InheritanceMultilevel1{
    public static void main(String args[]){
        Result obj=new Result();
        obj.display_info();
        obj.display_sport();
        obj.display_result();
    }
}