//
abstract class PersonalInfo{
      int New_password;
      abstract void Set_Password(int NewP);
      abstract void Get_Password();
      }
class GeneralInfo extends PersonalInfo{
    void Set_Password(int NP){
        New_password=NP;   
    }   
      void Get_Password(){
        System.out.println("NEW Password:"+New_password);
      }
}
class Abstraction2{
    public static void main(String[] args) {
        GeneralInfo obj=new GeneralInfo();
        obj.Set_Password(142525);
        obj.Get_Password();
    }
}

