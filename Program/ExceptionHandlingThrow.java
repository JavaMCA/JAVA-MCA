//Write a java program to demonstrate use of throw keyword.
class ExceptionHandlingThrow{
    void div(int a,int b) throws ArithmeticException
    {
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            int c=a/b;
            System.out.println("division="+c);
        }
    }
    public static void main(String[] args){
        ExceptionHandlingThrow obj=new ExceptionHandlingThrow();
       try{
        obj.div(20,0);
       }
       catch(Exception i){
        System.out.println(i);
       }
    }
}