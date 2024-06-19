//

import java.io.File;
 
class FileInfo{
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Anshi shrivastava\\Desktop\\MyFile.txt");
        if(f.exists()){
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File ReadAble: "+f.canRead());
            System.out.println("File size: "+f.length());
        }
        else{
            System.out.println("File doesn't exists...");
        }
    }
}