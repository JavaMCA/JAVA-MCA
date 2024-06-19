//By interface we can support the functionality of multiple inheritance.
interface printable{
    void print();
}
interface showable{
    void show();
}
 class Test implements printable,showable{
   public void print(){
        System.out.println("hello");
    }
   public void show(){
        System.out.println("welcome");
    }

 }
 class InheritanceMultiple{
    public static void main(String args[]){
        Test obj=new Test();
        obj.print();
        obj.show();
    }
 }