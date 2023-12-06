import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String text = "ceau. ceau. cf. bn tu? si eu bn. tare frt! te pup, ceau! ceau!";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] text2 = text.replaceAll("\\.", "").replace("?", "").replaceAll("!", "").replaceAll(",", "").split(" ");
        for (String s : text2) {
            if (!hashMap.containsKey(s))
                hashMap.put(s, 1);
            else
                hashMap.replace(s, hashMap.get(s) + 1);
        }
        System.out.println(hashMap);
    }
}