package Prueba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest extends main{
    @Test
    void testA() {
        int[][] A = {{0,0,0},{0,0,0},{0,0,0}};
        int actual = prueba(A);
        int esperado = 0;
        assertEquals(esperado, actual);
    }

    @Test
    void testB() {
        int[][] B = {{1,1,1},{1,1,1},{1,1,1}};
        int actual = prueba(B);
        int esperado = 1;
        assertEquals(esperado, actual);
    }

    @Test
    void testC() {
        int[][] C = {{2,1,3},{-1,1,0},{-2,4,1}};
        int actual = prueba(C);
        int esperado = -3;
        assertEquals(esperado, actual);
    }

    @Test
    void testD() {
        int[][] D = {{2,3,-1},{0,1/2,-1},{-2,1,4}};
        int actual = prueba(D);
        int esperado = 11;
        assertEquals(esperado, actual);
    }
}