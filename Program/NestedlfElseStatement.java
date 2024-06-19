import java.util.*;
class NestedlfElseStatement{
    public static void main(String args[])
{
    int age ;
    double weight,hemoglobin;
    boolean privious_donation, temperature;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age: ");
    age=sc.nextInt();
    System.out.println("Enter your weight: ");
    weight=sc.nextDouble();
    System.out.println("enter hemoglobin level: ");
    hemoglobin=sc.nextDouble();
    System.out.println("are you donated blood in last 56 days true/false: ");
    privious_donation=sc.nextBoolean();
    if(age>=18 ){
        if(weight>=45)
        {
            if(hemoglobin>=7)
            {
                if(privious_donation==false)
                {
                    System.out.println("you are Eligible for donate blood");
                }
                else{
                 System.out.println("sorry your are not Eligilbe because your are donted blood last 56 day ");
                }
                
            }
            else{
                System.out.println("sorry your are not eligible for donate blood your Hemoglobin level below");
            }
            
        }
        else{
            System.out.println(" SORRy you are underweight so cannot donate blood");
            }
        }
        
            else{
                System.out.println(" SORRy you are under Age so cannot donate blood");
                }
        
}
}
    