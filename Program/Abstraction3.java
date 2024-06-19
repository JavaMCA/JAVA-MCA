// A java program for showing an abstract class can have abstract or 
// Non abstract method.
abstract class A{
    abstract void INFO(); //abstract methid
    void display1()      //Non abstract method
    {
        System.out.println("Abstract menthod called");
    }
}
class B extends A{
    void INFO()     //abstract method implementation
    {
        System.out.println("this is abstract method body");
    }
    void display(){
        System.out.println("display method of B class is called");
    }
}
class Abstraction3{
    public static void main(String[] args) {
        B obj=new B();
        obj.display();
        obj.display1();
        obj.INFO();

    }
}