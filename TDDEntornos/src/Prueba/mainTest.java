package Prueba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest extends main{
    @Test
    void testA() {
        float[][] A = {{0,0,0},{0,0,0},{0,0,0}};
        float actual = test(A);
        float expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void testB() {
        float[][] B = {{1,1,1},{1,1,1},{1,1,1}};
        float actual = test(B);
        float expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void testC() {
        float[][] C = {{2,1,3},{-1,1,0},{-2,4,1}};
        float actual = test(C);
        float expected = -3;
        assertEquals(expected, actual);
    }

    @Test
    void testD() {
        float[][] D = {{2,3,-1},{0,1f/2f,-1},{-2,1,4}};
        float actual = test(D);
        float expected = 11;
        assertEquals(expected, actual);
    }
}