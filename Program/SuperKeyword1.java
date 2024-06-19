//A Java program to refer immediate parent class instance variable
class Student{
        int rollno=101;
}
class Result extends Student{
    int rollno=201;
    void printroll(){
    System.out.println(rollno);
    System.out.println(super.rollno);
}
}
class SuperKeyword1{
    public static void main(String args[])
{
    Result res=new Result();
    res.printroll();
}}