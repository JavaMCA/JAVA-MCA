import java.util.*;
class CheckPositiveNegative{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int number=sc.nextInt();
        if(number>0){
            System.out.println("Positive number");
        }
        else if(number<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }
    }
}