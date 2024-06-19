//Write a java program to demonstrate use of Nested catch block.
class ExceptionHandlingNestedCatch{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(Exception a){
            System.out.println(a);
            try{
               String name=null;
               System.out.println(name.toLowerCase());
            }
            catch(NullPointerException i){
              System.out.println(i);
            }
        }

        System.out.println("hello");
    }
 
}