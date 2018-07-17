public class CountSetBits {
    public static void main(String[] args) {

        int n = 5;
        // 1,2,3
        int count = 0;
        for (int i=1; i<=n; i++)
        {
            count += CountSetBits.getSetBitSummFromInt(i);
        }
        System.out.println("Count of set bits for n " + n + " is " + count);
    }

    private static int getSetBitSummFromInt(int intNumber)
    {
        int sum = 0;
        while (intNumber != 0)
        {
            int mod = intNumber%2;
            intNumber = intNumber/2;
            sum += mod;
        }
        return sum;
    }
}
