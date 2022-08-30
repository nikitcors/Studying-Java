package lvl9.lesson3.N3;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class StatelessBean {
    public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
        int i = (int)(Math.random() * 3);
        switch (i){
            case (1) :  throw new CharConversionException();
            case (2) :  throw new FileSystemException("");
            default: throw new IOException();
        }
    }

    public void log (Exception MyException){
        System.out.println(MyException.getMessage() + ", " + MyException.getClass().getSimpleName());
    }

}
