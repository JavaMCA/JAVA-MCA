
class Addition{
      void add(double num1,double num2)
	  {
	  double sum=num1+num2;
	  System.out.println(num1+"+" +num2+ "=" +sum);
	  }
	  void add(int num1,int num2,int num3)
	  {
	  int sum=num1+num2+num3;
	  System.out.println(num1+"+"+num2+"+"+num3+"="+sum);
	  }
	  void add(int num1, int num2,int num3, int num4)
	  {
	  int sum=num1+num2+num3+num4;
	  System.out.println(sum);
	  }
	}
class Test{
     public static void main(String[] args)
	 {
	 Addition obj=new Addition();
	 obj.add(2.9,5.5);
	 obj.add(1,2,3);
	 obj.add(4,5,6,7);
	 }
	 }