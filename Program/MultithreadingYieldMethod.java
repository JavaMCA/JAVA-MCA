class MethodYield extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        for(int i=0;i<=2;i++){
            System.out.println(name);
            Thread.yield();
        }
    }
}
class MultithreadingYieldMethod{
    public static void main(String[] args) {
        MethodYield T1=new MethodYield();
        MethodYield T2=new MethodYield();
        T1.start();
        T2.start();
    
    }
}