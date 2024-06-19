//Write a java program to demonstrate use of suspend() and resume() method.
class Myclass extends Thread{
     public void run(){
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(name);
        }
     }
}
class MultithreadingSuspendMethod{
    public static void main(String[] args) {
        Myclass t1=new Myclass();
        Myclass t2=new Myclass();
        Myclass t3=new Myclass();
        t1.setName("first thread");
        t2.setName("second thread");
        t3.setName("third thread");
        t1.start();
        t2.start();
        t2.suspend(); //pause
        t3.start();
        t2.resume();

        

    }
}