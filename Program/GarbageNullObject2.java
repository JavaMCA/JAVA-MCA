//way2- to make an object eligible for garbage collection
// Re Assigning the reference variable
class GarbageNullObject2{
    public static void main(String args[]){
        GarbageNullObject2 obj1=new GarbageNullObject2();
        GarbageNullObject2 obj2=new GarbageNullObject2();

        obj1=obj2;
        
    }
}
 
/*to make this object eligible for Garbage collector we re-assign 
the reference variable obj1 to another object obj2 */