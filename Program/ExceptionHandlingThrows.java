//write a java program to demonstrate use of throws keyword.
class ExceptionHandlingThrows{
    public static void main(String args[]) throws InterruptedException{
        for(int i=0;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}