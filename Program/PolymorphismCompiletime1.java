//By changing number of arguments
class Addition{
    void add(int a,int b){
        int sum=a+b;
        System.out.println("sum of two number:"+sum);
    }
    void add(int a, int b, int c){
        int sum=a+b+c;
        System.out.println("sum of three number :"+sum);
    }
}
class PolymorphismCompiletime1{
    public static void main(String args[]){
        Addition obj=new Addition();
        obj.add(2,2);
        obj.add(4,4,5);
    }
}