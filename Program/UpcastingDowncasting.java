class Parent{
    void show(){
        System.out.println("parent class called");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("child class called");
    }
} 
class UpcastingDowncasting{
    public static void main(String args[]){

        Parent P=new Child(); //upcasting
        P.show();

        // Child C=new Parent(); it gives compile time error
        Child C=(Child)P; //Downcasting
        C.show();
    }

}