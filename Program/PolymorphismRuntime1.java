//A java program to demonstrate use of Runtime polymorshism
class BankSBI{
    void RateOFIntrest(){
        System.out.println("SBI rate of intrest: 8%");
    }
}
class BankPNB extends BankSBI{
    void RateOFIntrest(){
        System.out.println(" PNB Rate of intrest:7%");
    }
}
class PolymorphismRuntime1{
    public static void main(String args[]){
        BankSBI obj=new BankSBI();
        obj.RateOFIntrest();
        obj=new BankPNB();
        obj.RateOFIntrest();
    
    }
}