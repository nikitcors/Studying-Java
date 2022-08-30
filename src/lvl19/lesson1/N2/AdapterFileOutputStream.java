package lvl19.lesson1.N2;

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter{
    FileOutputStream component;

    public AdapterFileOutputStream(FileOutputStream component) {
        this.component = component;
    }

    @Override
    public void flush() throws IOException {
        component.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        component.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        component.close();
    }
}
