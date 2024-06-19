//Runtime polymorphism is achieved by method overridng . it is also known as dynamic method dispatch or Dynamic binding
class A{
    void show(){
        System.out.println("hello this is A class");
    }
}
class B extends A{
    void show(){
        System.out.println("hello this is B class");
    }
}
class PolymorphismRuntime{
    public static void main(String args[]){
        A obj1=new A();
        obj1.show();
        A obj=new B(); //upcasting
        obj.show();
    }
}