class A{
    void show(){
        System.out.println("class A show method called");
    }
}
class B extends A{
    void show(){
        System.out.println("class B show method called ");
    }
}
class PolymorphismRuntime0{
    public static void main(String[] args) {
       
        A obj=new B();
        obj.show();

        obj=new A();
        obj.show();
    }
}