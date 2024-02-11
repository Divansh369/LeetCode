class Solution {
   public int countTriples(int limit)
    {
        int result = 0;
        int x = (int)Math.sqrt(limit);
        for (int m = 2; m <= x; m++)
        {
            int mSquare = m * m;
            for (int n = 1; n < m; n++)
            {
                if (m % 2 + n % 2 == 1 && gcd(m, n) == 1)
                {
                    int c = mSquare + n * n;
                    if (c <= limit)
                    {
                        result += limit / c;
                    }
                }
            }
        }

        return result * 2;
    }

    private int gcd(int a, int b)
    {
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}