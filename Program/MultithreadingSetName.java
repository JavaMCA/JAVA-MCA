class myset extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        for(int i=0; i<=2;i++){
            System.out.println(name);
        }
    }
}
class MultithreadingSetName{
    public static void main(String[] args) {
        myset t1=new myset();
        t1.setName("java thread1");
        t1.start();
       
        
    }
}