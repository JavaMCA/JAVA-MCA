//write a java program for handle ArithmeticException by try-catch block.
class Exception1{
    public static void main(String args[]){
        System.out.println("program started........");
        int a=10,b=0,c;
        try{
        c=a/b;
        System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("program Ended...........");

    }
    
}