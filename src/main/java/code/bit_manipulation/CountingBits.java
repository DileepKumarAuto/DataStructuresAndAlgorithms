package code.bit_manipulation;

public class CountingBits {

    /**
     * Create an array 'res' to store the count of set bits for each number from 0 to n.
     * Iterate from 1 to n and use the formula res[i] = 1 + res[i & (i - 1)] to count the set bits.
     * (i & (i - 1)) clears the least significant set bit, and adding 1 gives the count of set bits in i.
     * Return the 'res' array containing the count of set bits for each number from 0 to n.
     */

    public int[] countBits(int n) {
        int res[] = new int[n + 1];
        for (int i = 1; i <= n; i++)
            res[i] = 1 + res[i & (i - 1)];
        return res;
    }

    /**
     * Time Complexity: O(n) The algorithm iterates through each number from 1 to n once.
     * Space Complexity: O(n) The 'res' array of size n+1 is used to store the count of set bits.
     */

}
