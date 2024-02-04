class Solution {
    public String convert(String s, int numRows) {
        if (s.length() < 2 || numRows < 2) {
            return s;
        }
        char[] arr = s.toCharArray();
        char[] result = new char[arr.length];
        int x = 2 * numRows - 2;
        int size = (int) Math.ceil((double) s.length() / x);

        int l = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < size; j++) {
                if (j * x + i >= arr.length) {
                    continue;
                }
                result[l] = arr[j * x + i];
                l++;

                if (j * x + x - i >= arr.length || i >= x / 2 || i == 0) {
                    continue;
                }
                result[l] = arr[j * x + x - i];
                l++;
            }
        }

        return new String(result);
    }
}