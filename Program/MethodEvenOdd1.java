import java.util.Scanner;
class MethodEvenOdd1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number:");
        int num=scan.nextInt();
        findEvenOdd(num);
        findEvenOdd(4);
    }
    static void findEvenOdd(int x){
        if(x%2==0){
            System.out.println(x+ " is even");
        }
        else{
            System.out.println(x+ " is odd");
        }
    }
}