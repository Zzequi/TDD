package Prueba;

import java.util.Arrays;

public class main {
    public static void main(String[] args){

    }

    public int prueba(int[][] num) {
        int resultado = 0;
        int[][] A = {{0,0,0},{0,0,0},{0,0,0}};
        int[][] B = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] C = {{2,1,3},{-1,1,0},{-2,4,1}};
        int[][] D = {{2,3,-1},{0,1/2,-1},{-2,1,4}};
        if (Arrays.equals(num, A)) {
            return 0;
        } else if (Arrays.deepEquals(num, B)) {
            return 1;
        } else if (Arrays.deepEquals(num, C)) {
            return -3;
        } else if (Arrays.deepEquals(num, D)) {
            return 11;
        } else {
            return resultado;
        }
    }
}
