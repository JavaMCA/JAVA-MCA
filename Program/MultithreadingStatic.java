class methodstatic extends Thread{
  static int Available=2;
   static int passenger;

   methodstatic(int passenger){
 this.passenger=passenger;

    }
    public static synchronized void go(String name){
        if(Available>=passenger){
            System.out.println(name+"-  seat booked succesfully ");
            Available=Available-passenger;

        }
        else{
            System.out.println(name+" - sorry seat not available all the seat full");
        }

    }
    public void run(){
        String name=Thread.currentThread().getName();
        go(name);
    }

}
class MultithreadingStatic{
    public static void main(String[] args) {
        methodstatic p=new methodstatic(1);
        Thread t1=new Thread(p);
        Thread t2=new Thread(p);
        t1.setName("Johan");
        t2.setName("Mohan");

        t1.start();
        t2.start();

        methodstatic p1=new methodstatic(1);
        Thread t3=new Thread(p1);
        Thread t4=new Thread(p1);
        t3.setName("khushi");
        t4.setName("pooja");
        t3.start();
        t4.start();

        

    }
}