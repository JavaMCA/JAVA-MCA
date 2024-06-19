//Write a program to find largest of three numbers using ternary operator
import java.util.Scanner;
class LargestNumber{
    public static void main(String args[])
    {
     int num1,num2,num3,temp,largest;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter first number:");
     num1=sc.nextInt();
     System.out.println("enter second number:");
     num2=sc.nextInt();
     System.out.println("enter third number:");
     num3=sc.nextInt();
     temp=num1>num2?num1:num2;
     largest=num3>temp?num3:temp;
     System.out.println("largest number is:" +largest);
    }
}