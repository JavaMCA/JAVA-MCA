//write a java program to create multiple thread,and job of thread scheduler.
class Mythread1 extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1;i<=5;i++){
            System.out.println(n);
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1;i<=5;i++){
            System.out.println(n);
        }
    }
}
class ThreadExampleScheduler{
    public static void main(String[] args) {

        Mythread1 obj=new Mythread1();
        obj.start();

        Mythread2 obj1=new Mythread2();
        obj1.start();

        String n=Thread.currentThread().getName();
        for(int i=1;i<=5;i++){
            System.out.println(n);
        }
    }
}