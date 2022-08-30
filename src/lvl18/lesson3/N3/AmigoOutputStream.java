package lvl18.lesson3.N3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class AmigoOutputStream extends FileOutputStream {

    FileOutputStream fileOutputStream;

    public AmigoOutputStream(String name, FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(name);
        this.fileOutputStream = fileOutputStream;
    }

    public AmigoOutputStream(String name) throws FileNotFoundException {
        super(name);
    }

    @Override
    public void close() throws IOException {
        //super.close();
        fileOutputStream.flush();
        fileOutputStream.write("JavaRush © 2012-2013 All rights reserved.".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }
}
