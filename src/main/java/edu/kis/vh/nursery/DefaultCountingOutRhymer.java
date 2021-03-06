package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_COUNT = 12;
    public static final int EMPTY_RHYMER_VALUE = -1;
    private static final int EMPTY_INDEX = -1;

    private final int[] numbers = new int[NUMBERS_COUNT];
    private int currentNumberIndex = EMPTY_INDEX;

    public int getCurrentNumberIndex() {
        return currentNumberIndex;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++currentNumberIndex] = in;
    }

    public boolean isEmpty() {
        return currentNumberIndex == EMPTY_INDEX;

    }

    public boolean isFull() {
        return currentNumberIndex == NUMBERS_COUNT - 1;
    }

    protected int peekaboo() {
        if (isEmpty())
            return EMPTY_RHYMER_VALUE;
        return numbers[currentNumberIndex];
    }

    public int countOut() {
        if (isEmpty())
            return EMPTY_RHYMER_VALUE;
        return numbers[currentNumberIndex--];
    }

}
