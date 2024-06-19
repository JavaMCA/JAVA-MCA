class ExplicitConversion{
    public static void main (String args[]){
        long a=10;
        int b;
        b=(int)a;
        System.out.println(b);

        long x=2147483648l;
        int y;
        y=(int)x;
        System.out.println(y);

        double p=3.5;
        int q;
        q=(int)p;
        System.out.println(q);
        

         /* int n=1;
        boolean s;
        s=(boolean)n; //Error incompatible types int cannot be converted any type
        System.out.println(s); */




    
    }
}