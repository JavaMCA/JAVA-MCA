//Read only class
class Student{
    private String college="Bansal institute of science and technology";
    public String getInfo(){
        return college;
    }
}
class Encapsulation2{
    public static void main(String[] args) {
        Student obj=new Student();
       String college_name= obj.getInfo();
       System.out.println(college_name);
    }
}