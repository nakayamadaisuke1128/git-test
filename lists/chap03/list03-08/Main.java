import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> prefs = new HashMap<String,Integer>();
        prefs.put("kyoutohu", 255);
        prefs.put("toukyo", 1261);
        prefs.put("kumamotoken", 182);
        for (String key : prefs.keySet()) {
            int value = prefs.get(key);
            System.out.println(key + "の人口は、" + value);
        }
    }
}
