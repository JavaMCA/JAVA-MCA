//way1- to make an object eligible for garbage collection
//null the reference variable
class GarbageNullObject1{
    public static void main(String args[]){
        GarbageNullObject1 obj=new GarbageNullObject1();
        obj=null;
    }
}
 
/*to make this object eligible for Garbage collector we assign 
a null value to the reference variable*/