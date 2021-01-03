package edu.kis.vh.nursery;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerTest {


    @Test
    public void testCountOut() {
        FIFORhymer rhymer = new FIFORhymer();
        Assert.assertEquals(DefaultCountingOutRhymer.EMPTY_RHYMER_VALUE, rhymer.countOut());

        final int testValue1 = 1;
        final int testValue2 = 2;
        final int testValue3 = 3;
        rhymer.countIn(testValue1);
        rhymer.countIn(testValue2);
        rhymer.countIn(testValue3);
        Assert.assertEquals(testValue1, rhymer.countOut());
        Assert.assertEquals(testValue2, rhymer.countOut());
        Assert.assertEquals(testValue3, rhymer.countOut());
        Assert.assertEquals(DefaultCountingOutRhymer.EMPTY_RHYMER_VALUE, rhymer.countOut());
    }

}
