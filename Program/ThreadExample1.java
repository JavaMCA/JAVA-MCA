//write A program to create thread by Extending Thread class.
//print string with 1 second interval
class mythread extends Thread{
    @Override
    public void run(){
        try{
        for(int i=1;i<=5;i++){
         System.out.println("Bhopal");
         Thread.sleep(1000);
        }
    }
    catch(InterruptedException i){

    }
    }
}
class ThreadExample1{
    public static void main(String args[]) throws InterruptedException{
    mythread obj=new mythread();
        obj.start();
        for(int i=1;i<=5;i++){
            System.out.println("Indore");
            Thread.sleep(1000);
           }
    }
}