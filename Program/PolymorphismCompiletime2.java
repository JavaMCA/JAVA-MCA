//By changing data type of arguments
class Addition{
    void add(double num1, double num2){
        double sum=num1+num2;
        System.out.println(num1+ "+" +num2+ "=" +sum);
    }
    void add(int num1,int num2){
        int sum=num1+num2;
        System.out.println(num1+ "+" +num2+ "=" +sum);
    }
    void add(int num1,int num2,int num3){
        int sum=num1+num2+num3;
        System.out.println(num1+ "+" +num2+ "+" +num3+ "=" +sum);
    }
}
class PolymorphismCompiletime2{
    public static void main(String args[]){
        Addition obj=new Addition();
        obj.add(2.5,5.5);
        obj.add(1,2,4);
        obj.add(1,9);
    }
}
