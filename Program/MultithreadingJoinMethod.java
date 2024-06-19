//Write a java program to demonstrate use of join() method.
class MyThread1 extends Thread{
    public void run(){
    String name =Thread.currentThread().getName();
    for(int i=1;i<=3;i++){
        System.out.println(name);
    }

    }
}
class MultithreadingJoinMethod{
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread1 t2=new MyThread1();
        t2.start();
        try{
        t2.join();
        }
        catch(InterruptedException i){
           
        }
        t1.start();
        System.out.println("welcome to main thread");
        String name =Thread.currentThread().getName();
          for(int i=1;i<=3;i++){
             System.out.println(name);
        }
    }
}