//compile time polymorphism is achieved by method overloading
class A{
   void show(int password){
        System.out.println("password="+password);
    }
   void show(int password,String username){
        System.out.println("User name="+username);
        System.out.println("password="+password);
    }
}
class PolymorphismCompiletime{
    public static void main(String args[]){
        A obj=new A();
        obj.show(989760);
        obj.show(109098,"johanrosk123");
    }
}