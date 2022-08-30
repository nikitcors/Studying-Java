package lvl19.lesson1.N4;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class PersonScannerAdapter implements PersonScanner {


    Scanner component;


    public PersonScannerAdapter(Scanner component) {
        this.component = component;
    }

    public Person  read(){
        Person person = null;
        if (component.hasNext()){
            String personalInfo = component.next();
            String[] splitInfo = personalInfo.split(" ");
            person = new Person(splitInfo[0], splitInfo[1], splitInfo[2],new Date(splitInfo[3]+splitInfo[4]+splitInfo[5]));
        }
        return person;
    }

    @Override
    public void close() throws IOException {
        component.close();
    }
}
