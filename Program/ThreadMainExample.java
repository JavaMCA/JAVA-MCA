//write a java program to change main thread name.
class ThreadMainExample{
    public static void main(String[] args) {
        Thread s=Thread.currentThread();
        System.out.println("current thread:"+s);
        s.setName("new thread");
        s.setPriority(2);
        System.out.println("new name="+s);
    }
}
