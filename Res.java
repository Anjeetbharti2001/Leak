
import java.util.HashMap;

public class Res {
    public static void main(String args[]) {

        String str1 = "listen";
        String str2 = "silent";

        HashMap<Character, Integer> map = new HashMap<>();

        if (str1.length() != str2.length()) {
            System.out.println(false);
            return;
        }

        // Count characters in str1
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check characters in str2
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                System.out.println(false);
                return;
            }

            map.put(ch, map.get(ch) - 1);
        }

        System.out.println(true);
    }
}
