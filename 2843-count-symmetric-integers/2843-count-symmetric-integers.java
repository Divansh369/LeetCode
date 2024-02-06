class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            int n = numDigits(i);
            if (n % 2 == 0) {
                int lsum = 0, rsum = 0;
                int l = i / (int)Math.pow(10, n / 2);
                int r = i % (int)Math.pow(10, n / 2);
                
                while (l > 0) {
                    lsum += l % 10;
                    l /= 10;
                }
                while (r > 0) {
                    rsum += r % 10;
                    r /= 10;
                }
                
                if (lsum == rsum) {
                    count++;
                }
            }//  else { // Handle numbers with an odd number of digits
            //     int lsum = 0, rsum = 0;
            //     int l = i / (int)Math.pow(10, n / 2);
            //     int r = i % 10;
                
            //     while (l > 0) {
            //         lsum += l % 10;
            //         l /= 10;
            //     }
                
            //     if (lsum == r) {
            //         count++;
            //     }
            // }
        }
        return count;
    }

    public int numDigits(int x) {
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }
}
