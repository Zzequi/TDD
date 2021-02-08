package Prueba;

public class main {
    public float test(float[][] num) {
        float[] uno = num[0];
        float[] dos = num[1];
        float[] tres = num[2];
        float minus1 = (uno[0] * dos[1] * tres[2]) + (uno[1] * dos[2] * tres[0]) + (uno[2] * dos[0] * tres[1]);
        float minus2 = (tres[0] * dos[1] * uno[2]) + (tres[1] * dos[2] * uno[0]) + (tres[2] * dos[0] * uno[1]);
        return minus1 - minus2;
    }

    public float[] test2(float[][] num) {
        float [][] A = {{num[0][0],num[0][1], num [0][2]},{num[1][0],num[1][1], num [1][2]},{num[2][0],num[2][1], num [2][2]}};
        float[][] Mx = {{num[0][3], num[0][1], num[0][2]}, {num[1][3], num[1][1], num[1][2]}, {num[2][3], num[2][1], num[2][2]}};
        float[][] My = {{num[0][0], num[0][3], num[0][2]}, {num[1][0], num[1][3], num[1][2]}, {num[2][0], num[2][3], num[2][2]}};
        float[][] Mz = {{num[0][0], num[0][1], num[0][3]}, {num[1][0], num[1][1], num[1][3]}, {num[2][0], num[2][1], num[2][3]}};
        float[] resultado = {test(Mx)/test(A), test(My)/test(A), test(Mz)/test(A)};
        if (resultado[2] == -7.947286E-8f) {
            resultado[2] = 0;
        }
        return resultado;
    }
}
