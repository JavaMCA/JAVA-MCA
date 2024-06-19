//WAP to create own exception
class InvaildAgeException extends Exception{
    InvaildAgeException(String msg){
        System.out.println(msg);
    }
}
class ExceptionUserDefined{
    public static void main(String[] args) {
        try{
            vote(12);
        }
        catch(Exception i){
            System.out.println(i);
        }
        
    }
    public static void vote(int age) throws InvaildAgeException{
        if(age<18){
            throw new InvaildAgeException("Not Eligible for vote");
        }
        else{
            System.out.println("Eligible for vote");
        }
    }
}