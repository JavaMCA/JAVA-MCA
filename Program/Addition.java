import java.lang.*;
import javax.swing.*;
class Addition{
      void add(int num1,int num2)
	  {
	  int sum=num1+num2;
	  System.out.println(sum);
	  }
	  void add(int num1,int num2,int num3)
	  {
	  int sum=num1+num2+num3;
	  System.out.println(sum);
	  }
	  void add(int num1, int num2,int num3, int num4)
	  {
	  int sum=num1+num2+num3+num4;
	  System.out.println(sum);
	  }
	
     public static void main(String args[])
	 {
	 Addition obj=new Addition();
	 obj.add(1,2);
	 }
	 }