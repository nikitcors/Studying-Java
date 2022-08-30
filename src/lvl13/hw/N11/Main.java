package lvl13.hw.N11;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        InputStream isStream = null;
        ArrayList<Integer> inCollect = new ArrayList<>();
        try {
            BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(fileName.readLine())));
            while (file.ready()) {
                try {
                    int i = Integer.parseInt(file.readLine());
                    if (i % 2 == 0)
                        inCollect.add(i);
                } catch (NumberFormatException e) {
                    System.out.println("Символ не число");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("Can't read File");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if (isStream != null) {isStream.close();}
            if (fileName != null)  {fileName.close();}
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        inCollect = SortMass(inCollect);
        System.out.println(inCollect);

    }

    static ArrayList<Integer> SortMass (ArrayList<Integer> inCollect){
        Collections.sort(inCollect);
        return inCollect;
    }
}
