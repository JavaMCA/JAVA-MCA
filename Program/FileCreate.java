import java.io.*;

class FileCreate{
    public static void main(String[] args) //throws IOException
    {
        File f=new File("C:\\Users\\Anshi shrivastava\\Desktop\\MyFile.txt");
        try{
        if(f.createNewFile()){
            System.out.println("file created");
        }
        else{
            System.out.println("File already exist....");
        }
    }
    catch(IOException i){
        System.out.println("Exception Handled");
    }
    }
}