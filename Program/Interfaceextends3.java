// java program demostrate use of interface
interface A{
    public void method1();
    public void method2();
}
interface B extends A{
    public void method3();
}
class Test implements B {
    public void method1(){
        System.out.println(" Hello This is method1");
    }
    public void method2(){
        System.out.println(" Hello This is method2");
    }
    public void method3(){
        System.out.println("Hello this is method3");
    }
    
}
class Interfaceextends3{
    public static void main(String args[]){
        Test obj=new Test();
        obj.method1();
        obj.method2();
        obj.method3();
    }

}