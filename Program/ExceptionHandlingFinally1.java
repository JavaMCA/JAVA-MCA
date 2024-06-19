//
class ExceptionHandlingFinally1{
    public static void main(String[] args) {
        try{
            System.out.println("this try block......");
            System.out.println(35/0);
        }
        catch(Exception i){
            System.out.println("catch block.........");
            System.out.println("Exception"+i);
        }
        finally{
            System.out.println("this is finally block.......");
        }
    }
}