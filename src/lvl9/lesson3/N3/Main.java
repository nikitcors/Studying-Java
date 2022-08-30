package lvl9.lesson3.N3;

import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileSystemException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static StatelessBean BEAN = new StatelessBean();
    public static void main(String[] args)  {
        for (int i = 0; i < 3; i++) {
            try {
                BEAN = new StatelessBean();
                processExceptions();
            } catch (Exception e) {

            }
        }
    }

    static void processExceptions() throws CharConversionException, FileSystemException, IOException {
        try {
            BEAN.methodThrowExceptions();
        }
        catch(FileSystemException e){
            BEAN.log(e);
            throw e;
        }
        catch(CharConversionException e){
            BEAN.log(e);
        }

        catch(IOException e){
            BEAN.log(e);
        }
    }
}

