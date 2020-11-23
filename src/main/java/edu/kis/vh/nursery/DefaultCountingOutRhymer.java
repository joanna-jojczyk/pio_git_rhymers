package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int currentNumberIndex = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++currentNumberIndex] = in;
    }

    public boolean isEmpty() {
        return currentNumberIndex == -1;

    }

    public boolean isFull() {
        return currentNumberIndex == 11;
    }

    protected int peekaboo() {
        if (isEmpty())
            return -1;
        return numbers[currentNumberIndex];
    }

    public int countOut() {
        if (isEmpty())
            return -1;
        return numbers[currentNumberIndex--];
    }

}
