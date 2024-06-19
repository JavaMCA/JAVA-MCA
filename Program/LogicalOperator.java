import java.util.*;
class LogicalOperator{
    public static void main(String args[]){
        int a;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number");
        a=sc.nextInt();
        System.out.println(a>5 && a<20);
        System.out.println(a>5 || a<20);
        System.out.println(!(a<5));
    }
}

