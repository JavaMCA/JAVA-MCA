//Write a java program to demostrate use of setpriority() and getPriorirty
class myclass2 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        
    }
}
class MultithreadingPriority{
    public static void main(String[] args) {
        myclass2 t1=new myclass2();
        myclass2 t2=new myclass2();
        t1.setName("mythread T1");
        t2.setName("mythread T2");
        
        t1.setPriority(2);
        t2.setPriority(7);
        t1.start();
        t2.start();

    }
}