//A java program for use of super keyword in multilevel iheritance
class A{
    void display(){
        System.out.println("this is A class");
    }
}
class B extends A{
    void display(){
        System.out.println("This is  B class");
    }
    void show(){
        super.display();
        display();
    }
}
class C extends B{
    void display(){
        System.out.println("This is C class");
    }
    void print(){
        super.display();
        display();
    }
}
class SuperKeyword5{
    public static void main(String args[]){
        B obj=new B();
        obj.show();
        C obj1=new C();
        obj1.print();
    }
}