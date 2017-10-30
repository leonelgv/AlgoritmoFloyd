public class Programa {
    public static void main(String[] args) {
        AlgoritmoFloyd algoritmoFloyd = new AlgoritmoFloyd();

        int[][] matrizPesos = new int[4][4];
        matrizPesos[0][0] = 0;
        matrizPesos[0][1] = 10;
        matrizPesos[0][2] = 999999;
        matrizPesos[0][3] = 12;
        matrizPesos[1][0] = 999999;
        matrizPesos[1][1] = 0;
        matrizPesos[1][2] = 19;
        matrizPesos[1][3] = 999999;
        matrizPesos[2][0] = 11;
        matrizPesos[2][1] = 25;
        matrizPesos[2][2] = 0;
        matrizPesos[2][3] = 32;
        matrizPesos[3][0] = 20;
        matrizPesos[3][1] = 12;
        matrizPesos[3][2] = 12;
        matrizPesos[3][3] = 0;

        int[][] matriz;
        matriz = new int[5][5];

        int[][] matriz3 = {{0, 12, 15, 19},{22, 0, 15, 18},
                {18, 19, 0, 21},{23, 19, 12, 0}};

        int[][] matriz2 = {{0, 2, 5, 9},{12, 0, 5, 10},
                {8, 9, 0, 12},{12, 9, 1, 0}};
        String[] nodos = {"A", "B", "X", "Y"};
        algoritmoFloyd.calcularRutaMasCorta(matriz2, nodos);
        //algoritmoFloyd.calcularRutaMasCorta(matriz3);
        //algoritmoFloyd.calcularRutaMasCorta(matrizPesos);

    }
}
