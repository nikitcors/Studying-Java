package lvl15.hw.N7;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Character> outList = new ArrayList<Character>() ;
    static{
        try {
            //FileInputStream fin=new FileInputStream(Statics.FILE_NAME);
            FileReader reader = new FileReader (Statics.FILE_NAME);
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
                outList.add((char)c);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
    }
}
