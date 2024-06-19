//program for request JVM to run garbage collector by using System class
//By using System class
class Garbage2{
    public void finalize(){
        System.out.println("object is collected by Garbage collector");

    }
    public static void main(String args[]){
        Garbage2 obj=new Garbage2();
        obj=null;
        System.gc();
    }
}