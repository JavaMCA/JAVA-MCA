//  A java program to achieve multiple inheritace by interface
interface A{
    public void display();
}
interface B{
    public void show();
    }
class Multiple implements A,B{
    public void display(){
        System.out.println("hello this is display method");
    }
    public void show(){
        System.out.println("hello this is show method ");
    }
}
class Interface2{
    public static void main(String args[]){
        Multiple obj=new Multiple();
        obj.display();
        obj.show();
    }
}