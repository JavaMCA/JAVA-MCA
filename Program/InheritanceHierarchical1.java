class A{
    void display(){
        System.out.println("hello this is A class");
    }
}
class B extends A{
    void show(){
        System.out.println("hello this is B class \n");
    }
}
class C extends A{
    void print(){
        System.out.println("hello this is C class \n");
    }
}
class InheritanceHierarchical1{
    public static void main(String args[]){
        B obj=new B();
        obj.display();
        obj.show();
        
        C obj2=new C();
        obj2.display();
        obj2.print();

    }
}