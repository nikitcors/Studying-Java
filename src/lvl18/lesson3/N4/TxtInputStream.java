package lvl18.lesson3.N4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;

public class TxtInputStream extends FileInputStream {

    FileInputStream component;


    public TxtInputStream(String name, FileInputStream component) throws IOException {
        super(name);
        try {
            if (Pattern.matches(".*\\.txt", name)) throw new UnsupportedFileNameException();
            this.component = component;
        }catch (UnsupportedFileNameException e){
            super.close();
        }

    }

    private TxtInputStream(String name) throws FileNotFoundException {
        super(name);
    }
}
