package Prueba;

import java.util.Arrays;

public class main {
    public static void main(String[] args){

    }

    public float prueba(float[][] num) {
        float[] uno = num[0];
        float[] dos = num[1];
        float[] tres = num[2];
        float restar1 = (uno[0] * dos[1] * tres[2]) + (uno[1] * dos[2] * tres[0]) + (uno[2] * dos[0] * tres[1]);
        float restar2 = (tres[0] * dos[1] * uno[2]) + (tres[1] * dos[2] * uno[0]) + (tres[2] * dos[0] * uno[1]);
        float resultado = restar1 - restar2;
        return resultado;
    }
}
