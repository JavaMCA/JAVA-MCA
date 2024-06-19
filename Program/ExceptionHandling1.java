//java program to demonstrate use of Try-catch block.
class ExceptionHandling1{
    public static void main(String[] args) {
        int[] rollno={101,102,103,104,105,106};
        try{
        System.out.println(rollno[7]);
    }
    catch(ArrayIndexOutOfBoundsException i){
        System.out.println("roll number not found something went worng");
    }
}

}