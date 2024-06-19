class Addition{
    int num1,num2,num3,sum;
    Addition(int n1,int n2,int n3){
        num1=n1;
        num2=n2;
        num3=n3;
    }
    Addition(int n1,int n2){
        num1=n1;
        num2=n2;

    }
    Addition(int n1){
        num1=n1;
    }
    Addition(){
        num1=num2=num3=0;
    }
    void display(){
        int sum=num1+num2+num3;
        System.out.println("sum=" +sum);
    }
}
class ConstructorOverloading{
    public static void main(String args[]){
        Addition obj=new Addition(12,6,4);
        obj.display();
        Addition obj1=new Addition(4,5);
        obj1.display();
    }
}