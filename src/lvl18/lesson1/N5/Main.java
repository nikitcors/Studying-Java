package lvl18.lesson1.N5;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Integer> InSet = new TreeSet<>();
        BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inFile = new FileInputStream(inStr.readLine());

        while (inFile.available() > 0){
            InSet.add(inFile.read());
        }
        inFile.close();
        System.out.println(InSet);


    }
}
