//write a java program to demonstrate use of Nested finally block.
class ExceptionHandlingNestedFinally{
    public static void main(String[] args) {
        
        try{
            String name="Johan";
            System.out.println(name.toLowerCase());
        
        }
        catch(Exception s){
            System.out.println(s);

        }
        finally{
            try{
                System.out.println(10/0);
            }
            catch(ArithmeticException a){
                System.out.println(a);
            }
            finally{
                System.out.println("program excuted succesfully");
            }

        }
    }
}