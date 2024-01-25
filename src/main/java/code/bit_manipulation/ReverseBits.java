package code.bit_manipulation;

public class ReverseBits {

    /**
     * Initialize a variable ans to store the reversed bits.
     * Iterate through each bit in the input integer n using a loop with 32 iterations (assuming 32-bit integers).
     * Left shift ans by 1 position to make room for the next bit.
     * Use bitwise OR (|) to set the least significant bit of ans based on the current bit of n (achieved through bitwise AND with 1).
     * Right shift n by 1 position to move to the next bit.
     * Repeat this process for all 32 bits.
     * The final value of ans will represent the input integer n with its bits reversed.
     * Return the reversed integer ans.
     */

    public int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans |= (n & 1);
            n >>= 1;
        }
        return ans;
    }
    /**
     * Time complexity : O(1) The algorithm iterates through each bit in the 32-bit integer,
     * performing constant-time operations in each iteration.
     *
     * Space complexity : O(1)  The algorithm uses a constant amount of extra space to store the integer
     * ans and the loop variable i.
     * */

}
