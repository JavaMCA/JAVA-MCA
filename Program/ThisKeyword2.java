//A java program to demostrate use of this keyword. (when both instance and local variable same name )
class mythis{
    int id;
    mythis(int id){
        this.id=id;   
}
void show(){
    System.out.println(id);
}
}
class ThisKeyword2{
    public static void main(String args[]){
        mythis obj=new mythis(101);
        obj.show();
    }
}