import java.util.Scanner;
class TwoDimensionalArray{
    public static void main(String args[])
    {
        int matrix[][]=new int[3][3];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any 9 numbers:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }

    }
}