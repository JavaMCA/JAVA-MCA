//write a java program to demonstrate use of method level synchronization.
class Bank extends Thread{
    int balance=5000;
    int withdraw;
    Bank(int withdraw){
        this.withdraw=withdraw;
    }
    public synchronized void run(){
        String name=Thread.currentThread().getName();
        if(withdraw<=balance){
            System.out.println(name+": withdraw money ");
            balance=balance-withdraw;
        }
        else{
            System.out.println(name+": Insufficient Balance");
        }
    }
}
class MultithreadingSynchronization1{
    public static void main(String[] args) {
        Bank obj=new Bank(5000);
        Thread T1=new Thread(obj);
        Thread T2=new Thread(obj);
        T1.setName("Johan");
        T2.setName("Roshan");
        T1.start();
        T2.start();


    }
}