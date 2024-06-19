// a java program to demonstrate use of Encapsulation.
class Account {
    private long acc_no;
    private String name;
    private float amount;
    
    public void setAcc_no(long acc_no){
        this.acc_no=1022323232;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }

    public long getAcc_no(){
        return acc_no;
    }
    public String get_name(){
        return name;
    }
    public float get_amount(){
        return amount;
    }
}
class Encapsulation3{
    public static void main(String[] args) {
        Account obj=new Account();
        obj.setAcc_no(12343212);
        obj.setName("johan rosck");
        obj.setAmount(8098);

        System.out.println(obj.getAcc_no());
        System.out.println(obj.get_name());
        System.out.println(obj.get_amount());
    }
}