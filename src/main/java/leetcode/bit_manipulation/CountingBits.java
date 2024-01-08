package leetcode.bit_manipulation;

public class CountingBits {

    /**
     * Use a bitmask (mask) with a 1 in the least significant bit.
     * Iterate through each bit (32 bits in a 32-bit integer).
     * Check if the bit at the current position is 1 by using bitwise AND operation.
     * If the result is not 0, increment the count.
     * Right-shift the original number to check the next bit.
     * */

    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
    /**
     *
     * Time Complexity: O(1) : The algorithm iterates through each bit in a fixed-size 32-bit integer.
     * Space Complexity: O(1) : Constant space is used regardless of the input size.
     */
}
