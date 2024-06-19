class ClassSimpleExample{
    int number;
    void show(){
        System.out.println("number="+number);
    }
    public static void main(String args[]){
        ClassSimpleExample obj=new ClassSimpleExample();
        obj.number=12;
        obj.show();

    }
}