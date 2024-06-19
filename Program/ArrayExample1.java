class ArrayExample1{
    public static void main(String[] args) {
        int rollno[]=new int[5];
        for(int i=0;i<4;i++)
        {
            rollno[i]=101+i;
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(rollno[i]);
        }
    }
}