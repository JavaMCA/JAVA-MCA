// write a java program to demonstrate use of multiple try-catch bloack in program.
class ExceptionHandlingMultiple{
    public static void main(String[] args) {
        
    try{
        int a=10,b=0;
        int c=a/b;
        System.out.println(c);
    
    }
    catch(Exception a){
        System.out.println(a);
    }

    try{
        int[] rollno={101,102,103,104,105};
        System.out.println(rollno[5]);
    }
    catch(Exception b){
        System.out.println(b);
    }
}
}