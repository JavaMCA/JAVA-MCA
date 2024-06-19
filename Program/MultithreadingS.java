class mystop extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        for(int i=0; i<=2;i++){
            System.out.println(name);
        }
    }
}
class MultithreadingS{
    public static void main(String[] args) {
        mystop t1=new mystop();
        mystop t2=new mystop();
        t1.start();
        t2.start();
        t1.stop();
        
    }
}