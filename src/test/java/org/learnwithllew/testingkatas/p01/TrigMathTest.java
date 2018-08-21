package org.learnwithllew.testingkatas.p01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * Goal: 100% Test coverage of TrigMath and GenericMath
 */
public class TrigMathTest
{
    @Test
    public void testFloor() {
        assertEquals(1.0, GenericMath.floor(1.2), 0.0001);

    }

    @Test
    public void testSin() {
        assertEquals(0, TrigMath.sin(0), 0.0001);
        assertEquals(1, TrigMath.sin(TrigMath.HALF_PI), 0.0001);
    }

}
