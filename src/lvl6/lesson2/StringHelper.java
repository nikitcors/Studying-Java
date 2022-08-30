package lvl6.lesson2;

public class StringHelper {
    public static String multiply (String s,int count){
      String OutStr = "";
      for (int i = 0; i < count; i++){
          OutStr += s;
      }
      return OutStr;
    }

    public static String multiply (String s){
        String OutStr = "";
        for (int i = 0; i < 5; i++){
            OutStr += s;
        }
        return OutStr;
    }
}
