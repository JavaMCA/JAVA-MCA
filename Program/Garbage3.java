//program for request JVM to run garbage collector by using Runtime class
//By using System class

class Garbage3{
    protected void finalize(){
        System.out.println("object are distroyed ");
    }
    public static void main(String args[]){
        Runtime runtime_refrence=Runtime.getRuntime();

        Garbage3 obj=new Garbage3();
        obj=null;

        System.out.println("Total memory: "+runtime_refrence.totalMemory());
        System.out.println("free memory: "+runtime_refrence.freeMemory());
        runtime_refrence.gc();   //runtime reference calling gc() which request jvm to rungarbage collector
        System.out.println("garbage collector collect unrefernced object");
        System.out.println("free memory when garbage collector collect garbage: "+runtime_refrence.freeMemory());
    }
    }
