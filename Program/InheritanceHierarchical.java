//
class College{
    void college_Details(){
        int college_code=1029;
        String college_name="BIST";
        System.out.println("welcome to Students Portal");
        System.out.println("college Name="+college_name);
        System.out.println("college code="+college_code);
    }
}
class ScienceStudent extends College{
    void courseDetails(){
    String course_name="B.Sc.";
    int course_code=103;
    int course_fee=10000;
    college_Details();
    System.out.println("subjects-Maths physics, computer science,Fc1,Fc2");
}
}
class CommerceStudent extends College{
    void courseDetails(){
    String course_name="B.Com";
    int course_code=789;
    int course_fee=12000;
    college_Details();
    System.out.println("Course Name-"+course_name);
    System.out.println("Course code-"+course_code);
    System.out.println("Course Fees-"+course_fee);
    System.out.println("subjects-Accounts, economics, computer science,Fc1,Fc2");
}
}

public class InheritanceHierarchical {
    public static void main(String args[]){
      CommerceStudent obj=new CommerceStudent();
      obj.courseDetails();
      ScienceStudent obj2=new ScienceStudent();
      obj2.courseDetails();
    }

    
}