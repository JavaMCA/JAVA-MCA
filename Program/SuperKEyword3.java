//invoke immediate method of super class using super keyword
class A{
    void display(){
        System.out.println("hello");
    }
}
class B extends A{
    void display(){
        super.display();
        System.out.println("welcome");
    }
    
}
class SuperKEyword3{
    public static void main(String args[]){
        B obj=new B();
        obj.display();
        
    }
}