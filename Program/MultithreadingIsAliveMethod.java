class myclass1 extends Thread{
    public void  run(){
        System.out.println("isAlive method program...");
    }
}
class MultithreadingIsAliveMethod{
    public static void main(String[] args) {
        myclass1 t1=new myclass1();
        myclass1 t2=new myclass1();
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

    }
}