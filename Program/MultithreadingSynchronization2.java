//write a java program to demonstrate use of method level synchronized.
class Bus extends Thread{
    int available =2,passenger;
    Bus(int passenger){
        this.passenger=passenger;
    }
    public  synchronized void run(){
        String name=Thread.currentThread().getName();
        if(available>=passenger){
            System.out.println(name+" Reserved seat...!");
            available=available-passenger;
        }
        else{
            System.out.println("sorry seat not available...!");
        }
    }
}
class MultithreadingSynchronization2{
    public static void main(String[] args) {
        Bus P=new Bus(1);
        Thread T1=new Thread(P);
        Thread T2=new Thread(P);
        Thread T3=new Thread(P);
        
        T1.setName("johan");
        T2.setName("Sohan");
        T3.setName("Rohan");
         
        T1.start();
        T2.start();
        T3.start();
    }
}