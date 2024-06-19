//program to prove that a this keyword refers to current object 
//here object and this contain same unique reference number.
class A{
    void show(){
        System.out.println(this);
    }
}
class ThisKeyword1{
public static void main(String args[]){
        A r=new A();
        System.out.println(r);
        r.show();

    }
}