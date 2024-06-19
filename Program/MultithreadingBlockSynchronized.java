//write a program to demonstrate use of Block level synchronization.
class Table{
    public void printTable(int num){
        synchronized(this){
        for(int i=1;i<=10;i++){
            System.out.print(num*i+"  ");
        }
        System.out.println("");
    }
    }
}
class OurThread extends Thread{
    Table t;
    int num;
    OurThread(Table t,int num){
        this.t=t;
        this.num=num;
    }
    public void run(){
        t.printTable(num);
    }
}

class MultithreadingBlockSynchronized{
    public static void main(String[] args) {
        Table obj=new Table();
        OurThread T1=new OurThread(obj,2);
        OurThread T2=new OurThread(obj,7);
        T1.start();
        T2.start();

    }
}