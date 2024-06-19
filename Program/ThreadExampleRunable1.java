class mythread implements Runnable{
     public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("This is mythread");
        }
     }
}
class ThreadExampleRunable1{
    public static void main(String[] args) {
        mythread obj=new mythread();
        Thread t=new Thread(obj);
        t.start();
    }
}

