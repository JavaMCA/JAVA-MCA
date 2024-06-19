class ThreeDimensionalArray{
    public static void main(String args[]){
        int arr[][][]= new int[2][3][3];
        int i,j,k;
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                for(k=0;k<3;k++){
                    arr[i][j][k]=j;
                }
            }
        }

        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                for(k=0;k<3;k++){
                    System.out.print(arr[i][j][k]);
                }
                System.out.println(" ");
            }
            System.out.println("");
        }
    }
}