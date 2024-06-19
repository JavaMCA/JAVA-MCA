class TestGarbage{
    TestGarbage(){
        System.out.println("object  is created");
    }
    protected void finalize(){
        System.out.println("object is destroyed");
    }
    public static void main(String args[]){
        TestGarbage obj=new TestGarbage();
        obj=null;
        TestGarbage obj1=new TestGarbage();
        TestGarbage obj2=new TestGarbage();
        obj1=obj2;
        //new TestGarbage();
        System.gc();
        
    }
}