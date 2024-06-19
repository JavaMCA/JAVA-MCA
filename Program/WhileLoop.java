//program to demonstrate while loop
//Write a program to print table of any number
import java.util.*;
class WhileLoop{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
    int i=1;
    while(i<=10){
        System.out.println(i*num);
        i++;
    }
}}