//super keyword used to invoke immediate parent class method
class Student{
    void info(){
        System.out.println("name=jems");
        System.out.println("id=10101");
    }
}
class Result extends Student{
    void info(){
        System.out.println("name=priya");
        System.out.println("id=22222");
    }
    void showresult()
{
    super.info();
    info();
}
}
class SuperKeyword2{
    public static void main(String args[]){
        Result obj1=new Result();
        obj1.showresult();
    }
}