//A java program to demonstrate use of encapsulation
//here is a class which s fully encapsulate class
//it has private data member and getter & setter methods.
class Student{
    private int Password;
    public void SetPassword(int p)  //setter method for set password
    {
        Password=p;
    }
    public int getPassword()     //getter method for password
    {
        return Password;
    }
}
class Encapsulation1{
    public static void main(String[] args) {
        Student obj=new Student();
        obj.SetPassword(1234);
        int pass=obj.getPassword();
        System.out.println(pass);
        //obj.Password=9009; Error occured bcz Password is private

    }
}