package io.github.zebMcCorkle.AlgebraII;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SyntheticDivisionTest {
    @Test
    public void number9() {
        SyntheticDivision.Result result = SyntheticDivision.divide(new double[] {7, -4, -400, -100}, 8);
        assertTrue(Arrays.equals(result.getCoefficientArray(), new double[] {7, 52, 16}));
        assertEquals(28.0, result.getRemainder());
    }

    @Test
    public void number10() {
        SyntheticDivision.Result result = SyntheticDivision.divide(new double[] {8, 0, -28.5, -9, 10}, -0.25);
        assertTrue(Arrays.equals(result.getCoefficientArray(), new double[] {8, -2, -28, -2}));
        assertEquals(10.5, result.getRemainder());
    }

    @Test
    public void number11() {
        SyntheticDivision.Result result = SyntheticDivision.divide(new double[] {2.5, 6, -5.5, -10}, -1);
        assertTrue(Arrays.equals(result.getCoefficientArray(), new double[] {2.5, 3.5, -9}));
        assertEquals(-1.0, result.getRemainder());
    }
}
