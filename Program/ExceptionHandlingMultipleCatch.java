//write a java program to demonstrate use of multiple catch block in program.
class ExceptionHandlingMultipleCatch{
    public static void main(String[] args) {
        try{
            int a=10,b=9,c;
            c=a/b;
            System.out.println(c);

            int roll[]={101,102,103,104,105};
            System.out.println(roll[4]);

            String name=null;
            System.out.println(name.toUpperCase());

        }
        catch(ArithmeticException a){
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println(b);
        }
        catch(NumberFormatException c){
            System.out.println(c);
        }
        catch(Exception n){
            System.out.println(n);
        }
        
    }
}