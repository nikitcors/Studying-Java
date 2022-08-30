package lvl15.hw.N9;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inStr = new BufferedReader(new InputStreamReader(System.in));
        String currentStr = inStr.readLine();
        inStr.close();
        Params params = new Params(currentStr);
        System.out.println(params.getParams());
        List<String> meaning = params.getMeaning();
    }

    public static class Params{
        List<String> params = new ArrayList<>();
        List<String> meaning = new ArrayList<>();

        public List<String> getParams() {
            return params;
        }

        public List<String> getMeaning() {
            for (String current:
                    meaning) {
                if (current.contains(".")){alert(Double.parseDouble(current));}
                else {alert(current);}
            }
            return meaning;
        }

        public Params(String currentStr){
            currentStr =  currentStr.substring(currentStr.indexOf("?") + 1);

            String[] currentParams = currentStr.split("&");
            for(String word : currentParams){
                //System.out.println(word);
                params.add(word.split("=")[0]);
                if (word.split("=")[0].equals("obj") && (word.split("=").length > 1)){
                    meaning.add(word.split("=")[1]);
                }
            }
        }
        public void alert(Double value){
            System.out.println(value.getClass().getSimpleName() + " " + value);
        }

        public void alert(String value){
            System.out.println(value.getClass().getSimpleName() + " " + value);
        }
    }
}
