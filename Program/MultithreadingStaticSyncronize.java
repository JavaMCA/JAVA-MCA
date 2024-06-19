//write a java program to demonstrate use of static synchronization.
class Bus extends Thread{
     static int available =1;
     static int passenger;
    Bus(int passenger){
        this.passenger=passenger;
    }
    public static synchronized void go(){
        String name=Thread.currentThread().getName();
        if(available>=passenger){
            System.out.println(name+" Reserved seat1...!");
            available=available-passenger;
        
        }
        else{
            System.out.println("sorry seat not available...!");
        }
        
    }
    public void run(){
        Bus.go();
    }
}

class MultithreadingStaticSyncronize{
    public static void main(String[] args) {
        Bus P1=new Bus(1);
        Thread T1=new Thread(P1);
        Thread T2=new Thread(P1);

        T1.setName("Johan");
        T2.setName("Sohan");

        Bus P2=new Bus(1);
        Thread T3=new Thread(P2);
        Thread T4=new Thread(P2);

        T3.setName("Rohan");
        T4.setName("Mohan");
         
        T1.start();
        T2.start();
        T3.start();
        T4.start();
    }
}