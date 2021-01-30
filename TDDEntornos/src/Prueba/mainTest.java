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

    @Test
    void testK() {
        float[][] K = {{3,2,1,1},{5,3,4,2},{1,1,-1,1}};
        float[] actual = test2(K);
        float[] expected = {-4,6,1};
        assertEquals(expected, actual);
    }

    @Test
    void testK2() {
        float[][] K = {{1,1,1,34f/15f},{1,-1,1,-16f/15f},{5,3,-1,8}};
        float[] actual = test2(K);
        float[] expected =  {3f/5f,5f/3f,0};
        assertEquals(expected, actual);
    }
}