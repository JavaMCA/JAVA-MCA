//A java program to invoke current  class method.
class A{
    void m(){
        System.out.println("hello m");
        }
        void n(){
            System.out.println("hello n");
           this.m(); //when we don't use this compiler automatically add this keyword
        }
    }
class ThisKeyword5{
    public static void main(String args[]){
        A obj=new A();
        obj.n();
    }
}