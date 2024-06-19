//write a java program to demonstrate use of Nested Try block.
class ExceptionHandlingNestedTry{
    public static void main(String[] args) {
        try{

        
        try{
            int arr[]={11,22,33,44};
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
        System.out.println(10/0);
    }
    catch(ArithmeticException b){
        System.out.println(b);
    }
    System.out.println("program ended..................");
    }
}