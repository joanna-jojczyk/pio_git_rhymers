package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int testValue = 4;
        rhymer.countIn(testValue);
        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        Assert.assertTrue(rhymer.isEmpty());
        rhymer.countIn(888);
        Assert.assertFalse(rhymer.isEmpty());
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        for (int i = 0; i < DefaultCountingOutRhymer.NUMBERS_COUNT; i++) {
            Assert.assertFalse(rhymer.isFull());
            rhymer.countIn(888);
        }
        Assert.assertTrue(rhymer.isFull());
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        Assert.assertEquals(DefaultCountingOutRhymer.EMPTY_RHYMER_VALUE, rhymer.peekaboo());

        final int testValue = 4;
        rhymer.countIn(testValue);
        Assert.assertEquals(testValue, rhymer.peekaboo());
        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        Assert.assertEquals(DefaultCountingOutRhymer.EMPTY_RHYMER_VALUE, rhymer.countOut());

        final int testValue1 = 1;
        final int testValue2 = 2;
        final int testValue3 = 3;
        rhymer.countIn(testValue1);
        rhymer.countIn(testValue2);
        rhymer.countIn(testValue3);
        Assert.assertEquals(testValue3, rhymer.countOut());
        Assert.assertEquals(testValue2, rhymer.countOut());
        Assert.assertEquals(testValue1, rhymer.countOut());
        Assert.assertEquals(DefaultCountingOutRhymer.EMPTY_RHYMER_VALUE, rhymer.countOut());
    }

}
