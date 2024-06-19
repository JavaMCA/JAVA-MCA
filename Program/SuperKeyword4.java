//A java program for super keyword used for invoke parent class constructor
class A{
    A(){
        System.out.println("this is constructor of A class");
    }
}
class B extends A{
    
    B(){
        super();
        System.out.println("this is constructor of B class");
    }
}
class SuperKeyword4{
    public static void main(String args[]){
        B obj=new B();
    
    }
}