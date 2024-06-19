// java program demostrate use of interface
interface myinterface{
    public void method1();
    public void method2();
}
class A implements myinterface{
    public void method1(){
        System.out.println(" Hello This is method1");
    }
    public void method2(){
        System.out.println(" Hello This is method2");
    }
    
}
class Interface1{
    public static void main(String args[]){
        A obj=new A();
        obj.method1();
        obj.method2();
    }

}