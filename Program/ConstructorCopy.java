//A java program to demostrate use of Copy Constrator
 class Student{
        int rollno;
        double marks;
        Student(int rno,double m){
            rollno=rno;
            marks=m;
        }
        Student(Student d){
            marks=d.marks;
            rollno=d.rollno;
        }
        void display(){
            System.out.println("Roll no="+rollno);
            System.out.println("Marks="+marks);
    
        }
        }
    class ConstructorCopy{
        public static void main(String args[]){
            Student obj=new Student(101,412.0);
            obj.display();
            Student obj1=new Student(obj);
            obj1.display();
            
        }
    }


