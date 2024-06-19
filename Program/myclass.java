class BankSBI{
       void RateofIntrest()
	   {
	   System.out.println("rate of intrest of SBI is 4%  ");
	   }
	   void creditcard()
	   {
		   System.out.println(" provides credit card");
	   }
    }
class BankPNB extends BankSBI{
       void RateofIntrest()
	   {
	   System.out.println("rate of intrest of PNB is 6% ");
	   }
	}
class myclass{
       public static void main(String args[])
	   {
		BankSBI obj1=new BankSBI();
		obj1.RateofIntrest();
		obj1=new BankPNB();
		obj1.RateofIntrest();
		obj1=new BankSBI();
		obj1.RateofIntrest();
	   BankPNB obj=new BankPNB();
	   obj.RateofIntrest();
	   obj.creditcard();
	   
	   }
	   }