//this-A java program to pass current object as an argument in the method
class Myclass{
    void Show(Myclass obj){
        System.out.println("hello this is show method");
    }
    void P(){
        Show(this);
    }
}
class ThisKeyword6{
    public static void main(String args[]){
        Myclass std=new Myclass();
        std.P();
    }
}