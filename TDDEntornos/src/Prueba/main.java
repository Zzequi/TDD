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
        float[] resultado = {0};
        return resultado;
    }
}
