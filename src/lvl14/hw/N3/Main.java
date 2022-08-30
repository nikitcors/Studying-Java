package lvl14.hw.N3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        String s;
        while (true)
        {
            s = reader.readLine();
            //создаем объект, пункт 2
            if (s.equals("user")) {
                person = new Person.User();
                doWork(person); //вызываем doWork
                continue;
            }

            if (s.equals("loser")) {
                person = new Person.Loser();
                doWork(person); //вызываем doWork
                continue;
            }

            if (s.equals("coder")) {
                person = new Person.Coder();
                doWork(person); //вызываем doWork
                continue;
            }

            if (s.equals("proger")) {
                person = new Person.Proger();
                doWork(person); //вызываем doWork
                continue;
            }

            break; // User input other string, break.
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        }
        if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.User){
            ((Person.Coder) person).coding();
        }
        if (person instanceof Person.User){
            ((Person.Proger) person).enjoy();
        }
    }
}
