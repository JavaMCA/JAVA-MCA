import java.util.*;
class MethodSampleReturn2{
    int CompareNum(int x, int y){
        System.out.println("x=" +x+ "\n y=" +y);
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String args[]){
        MethodSampleReturn2 obj=new MethodSampleReturn2();
        int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter anty two number:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        int result= obj.CompareNum(num1,num2);
        System.out.println("greater is :" +result);
    }
    
}