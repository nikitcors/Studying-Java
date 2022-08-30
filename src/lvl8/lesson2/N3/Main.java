package lvl8.lesson2.N3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> listArray =new ArrayList<String>();
        List<String> listLinked =new LinkedList<String>();
        Date currentTime = new Date();
        for (int i = 0; i < 10000; i ++)
        {
            listArray.add(String.valueOf(i));
            String str = listArray.get(i);
        }
        Date currentTimeAfter = new Date();
        long difference = currentTimeAfter.getTime() - currentTime.getTime();
        System.out.println(String.valueOf(difference));
        currentTime = new Date();

        for (int i = 0; i < 10000; i ++)
        {
            listArray.add(String.valueOf(i));
            String str = listArray.get(i);
        }
        currentTimeAfter = new Date();
        difference = currentTimeAfter.getTime() - currentTime.getTime();
        System.out.println(String.valueOf(difference));
    }
}
