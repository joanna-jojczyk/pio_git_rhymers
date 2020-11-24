package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int currentNumberIndex = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++currentNumberIndex] = in;
    }

    public boolean callCheck() {
        return currentNumberIndex == -1;
    }

    public boolean isFull() {
        return currentNumberIndex == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[currentNumberIndex];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[currentNumberIndex--];
    }

}
