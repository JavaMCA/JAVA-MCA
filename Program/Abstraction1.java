abstract class A{

    void display1(){
        System.out.println("Abstract menthod called");
    }
}
class B extends A{
    void display(){
        System.out.println("display method of B class is called");
    }
}
class Abstraction1{
    public static void main(String[] args) {
        B obj=new B();
        obj.display();
        obj.display1();

    }
}