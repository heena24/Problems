public class CountSetBits {

    // O(nLogn) solution
    public static void main(String[] args)
    {
        int n = 3;
        int count = 0;
        for (int i=1; i<=n; i++)
        {
            count += CountSetBits.getSetBitSum(i);
        }
        System.out.println("Count of set bits for n " + n + " is " + count);
    }

    private static int getSetBitSum(int intNumber)
    {
        if (intNumber <= 0) {
            return 0;
        }

        return (intNumber%2 == 0 ? 0 : 1) + getSetBitSum(intNumber/2);
    }
}
