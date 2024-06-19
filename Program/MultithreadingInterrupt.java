//Write a java program to demonstrate use of interrupt method.
class InterruptMethod extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        try{
        for(int i=1;i<=3;i++){
            System.out.println(name);
            Thread.sleep(10); 
        }
    }
    catch(InterruptedException i){
          
    }
}
}
class MultithreadingStop{
    public static void main(String[] args) {
        InterruptMethod T1=new InterruptMethod();
        T1.start();
        T1.interrupt();
        
       
    }
}