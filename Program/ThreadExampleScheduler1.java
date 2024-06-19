//write a java program to change thread name using setName() name.
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
class ThreadExampleScheduler1{
    public static void main(String[] args) {
        
        Mythread1 obj=new Mythread1();
        obj.setName("My Thread 1");
        obj.start();

        Mythread2 obj1=new Mythread2();
        obj1.setName("My Thread 2");
        obj1.start();

        
    }
}