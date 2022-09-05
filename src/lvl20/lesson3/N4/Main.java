package lvl20.lesson3.N4;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        Main savedObject = new Main(13);
        Main readObject = new Main(0);
        if (savedObject.toString() != null){
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
            outputStream.writeObject(savedObject);
            outputStream.close();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);
            readObject = (Main)inputStream.readObject();
            inputStream.close();
            byteArrayOutputStream.close();
            byteArrayInputStream.close();
        }
        System.out.println((readObject.toString().equals(savedObject.toString())) ? "Yes":"No");
    }


    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Main(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}

