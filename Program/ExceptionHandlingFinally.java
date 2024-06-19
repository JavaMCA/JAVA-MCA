//write java program to demonstrate use of Finally block.
class ExceptionHandlingFinally{
    public static void main(String[] args) {
        String[] UserName={"sohan","Johan","raghav","pooja","ravi"};
        try{
        for(int i=0;i<=5;i++){
        System.out.println(UserName[i]);
    }
}
catch(Exception i){
    System.out.println("user not found ");
}
finally{
    System.out.println("thank you finally block executed");
}
}
}
