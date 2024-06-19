class MethodStop extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        for(int i=0;i<=2;i++){
            System.out.println(name);
        }
    }
}
class MultithreadingStopMethod{
    public static void main(String[] args) {
        MethodStop T1=new MethodStop();
        MethodStop T2=new MethodStop();
        T1.start();
        T2.start();
        T2.stop();
    }
}