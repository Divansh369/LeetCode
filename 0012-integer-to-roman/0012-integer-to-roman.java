import java.util.*;

class Solution {
 public static String intToRoman(int num) {
        String roman = "";
        HashMap<Integer, String> dic = new HashMap<>();
        dic.put(1, "I");dic.put(4, "IV");dic.put(5, "V");dic.put(9, "IX");dic.put(10, "X");
        dic.put(40, "XL");dic.put(50, "L");dic.put(90, "XC");dic.put(100, "C");dic.put(400, "CD");
        dic.put(500, "D");dic.put(900, "CM");dic.put(1000, "M");
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        for (int value : values) {
            while (num >= value) {
                roman+=dic.get(value);
                num -= value;
            }
        }
        return roman;
    }
}