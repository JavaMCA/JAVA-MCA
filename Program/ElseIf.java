import java.util.*;
class ElseIf{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter percentage");
        float per=sc.nextFloat();
        if(per>=80){
            System.out.println("A");
        }
        else if(per>=60 && per<80){
            System.out.println("B");
        }
        else if(per>=40 && per<60){
            System.out.println("C");
        }
        else if (per>=33 && per<40) {
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
    }
}