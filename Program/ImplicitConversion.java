class ImplicitConversion{
    public static void main(String args[])
    {
        
        byte num=12;
        short x=num; //range of short is greater than byte


        double a;
        a=25; //by adding 
        
        char ch='A';
        int b;
        b=ch; //char can be represent as int

        int roll=101;
        long l=roll; //range of l is greater than int
        
        System.out.println("value of x=" +x);
        System.out.println("value of a=" +a);
        System.out.println("value of b=" +b);
        System.out.println("value of l =" +l);
    }
}