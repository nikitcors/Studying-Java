package lvl22.lesson1.N2;

public class Main {
    public static void main(String[] args)  {
        System.out.println(getPartOfString(String.format("\tJavaRush \t- лучши")));
    }

    static String getPartOfString(String fullStr){
        if (fullStr.replaceAll("[^\\t]","").length() < 2) {
            try {
                throw new TooShortStringException();
            } catch (TooShortStringException e) {
                //System.out.println("Строка не подходит");
                return "Строка не подходит";
            }
        }
        String subString = fullStr.substring(fullStr.indexOf("\\t") + 1);
        int counterSpace = 0;
        int counterChar = 0;
        for(char c: subString.toCharArray())
        {
            counterSpace = (c == '\t') ? counterSpace + 1 : counterSpace;
            counterChar ++;
            if (counterSpace == 2) break;
        }
        return subString.substring(0,counterChar - 1);
    }

    static class TooShortStringException extends Exception{

    }


}
