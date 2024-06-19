//java program to demonstrate use of a method call by reference
class MethodCallByReference{
    int c,g;
    MethodCallByReference(int a,int b)
    {
         c=a;
         g=b;
    }
    void swap(MethodCallByReference ob){
        int t=ob.c;
        ob.c=ob.g;
        ob.g=t;
    }
    public static void main(String args[]){
        MethodCallByReference ob=new MethodCallByReference(45,32);
        System.out.println("c="+ob.c+" g="+ob.g);
        ob.swap(ob);
        System.out.println("c="+ob.c+" g="+ob.g);
    }
}