//way2- to make an object eligible for garbage collection
// object create inside the method
class GarbageNullObject3{
    public static void method1(){
        GarbageNullObject3 obj1=new GarbageNullObject3();
        GarbageNullObject3 obj2=new GarbageNullObject3();
    }
    public static void main(String args[]){
        method1();
        
    }
}
 
/*to make this object eligible for Garbage collector we  created object 
 * inside the method after completion of execution of this method reference 
 * object is no longer pointing.
 */