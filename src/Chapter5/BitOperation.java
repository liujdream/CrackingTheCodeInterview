package Chapter5;

public class BitOperation {

    boolean getBit(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    int setBit(int num, int i) {
        return num | (1 << i);
    }

    int clearBit(int num, int i) {
        int mask = ~(1 << i);
        return num & mask;
    }

    // To clear all bits from the most significant bit through i (inclusive), we create a mask with a 1 at the ith bit (1 << i).
    // Then, we subtract 1 from it, giving us a sequence of 0s followed by i-1 1s. We then AND our number with this mask to leave just the last i bits.
    int clearBitsMSBthroughI(int num, int i) {
        int mask = (1 << i) - 1;
        return num & mask;
    }

    //To clear all bits from i through 0 (inclusive), we take a sequence of all1s (which is -1) and shift it left by i + 1 bits.
    // This gives us a sequence of 1s (in the most significant bits) followed by i 0 bits.
    int clearBitsIthrough0(int num, int i) {
        int mask = (-1 << (i + 1));
        return num & mask;
    }

    //To set the ith bit to a value v, we first clear the bit at position i by using a mask that looks like 11101111. Then, we shift the intended value, v, left by i bits.
    // This will create a number with bit i equal to v and all other bits equal to 0. Finally, we OR these two numbers, updating the ith bit if v is 1 and leaving it as 0 otherwise.
    int updateBit(int num, int i, boolean bitIs1) {
        int value = bitIs1 ? 1 : 0;
        int mask = ~(1 << i);
        return (num & mask) | (value << i);
    }
}
