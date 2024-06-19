//write A program to create thread by Extending Thread class.
class T extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Bhopal");
        }
    }
}
class ThreadExample0{
    public static void main(String[] args) {
        T obj=new T();
        obj.start();
        for(int i=1;i<=5;i++){
            System.out.println("Indore");
        }
    }
}