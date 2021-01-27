package Prueba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest extends main{
    @Test
    void testA() {
        float[][] A = {{0,0,0},{0,0,0},{0,0,0}};
        float actual = prueba(A);
        float esperado = 0;
        assertEquals(esperado, actual);
    }

    @Test
    void testB() {
        float[][] B = {{1,1,1},{1,1,1},{1,1,1}};
        float actual = prueba(B);
        float esperado = 0;
        assertEquals(esperado, actual);
    }

    @Test
    void testC() {
        float[][] C = {{2,1,3},{-1,1,0},{-2,4,1}};
        float actual = prueba(C);
        float esperado = -3;
        assertEquals(esperado, actual);
    }

    @Test
    void testD() {
        float[][] D = {{2,3,-1},{0,0.5f,-1},{-2,1,4}};
        float actual = prueba(D);
        float esperado = 11;
        assertEquals(esperado, actual);
    }
}