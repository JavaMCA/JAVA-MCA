//write a java program for handle NullPointerException by try-catch block.
class Exception2{
    public static void main(String[] args) {
        String name=null;
        try{
        System.out.println(name.toUpperCase());
    }
    catch(NullPointerException i){
        System.out.println("null cannot be casted");
    }
}
}