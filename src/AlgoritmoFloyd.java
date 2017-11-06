public class AlgoritmoFloyd {
    public void calcularRutaMasCorta(int[][] grafos, String[] nodos) {
        String[][] matrizCaminos = new String[grafos.length][grafos.length];
        //System.out.println(grafos.length);
        for (int a = 0; a < grafos.length; a++) {
            for (int b = 0; b < grafos.length; b++) {
                matrizCaminos[b][a] = nodos[a];
            }
        }

        for (int x = 0; x < grafos.length; x++) {
            for (int a = 0; a < grafos.length; a++) {
                //System.out.println("0, " + a + " = " + grafos[0][a]);
                //System.out.println(a + ", 0 = " + grafos[a][0]);
                for (int b = 0; b < grafos.length; b++) {
                    System.out.print(x + ", " + a + " + " + b + ", " + x + " = " +
                            grafos[x][a] + " + " + grafos[b][x] + " = "
                            + (grafos[x][a] + grafos[b][x]) + " < " +
                            grafos[a][b] + " \t(" + a + ", " + b + ")");
                    if ((grafos[x][a] + grafos[b][x]) < grafos[a][b]) {
                        System.out.println(" \tSe cambia: (" + a + ", " + b + ") " + grafos[a][b] + " por " + (grafos[x][a] + grafos[b][x]));
                        grafos[a][b] = (grafos[x][a] + grafos[b][x]);
                        matrizCaminos[a][b] = nodos[x];
                    } else {
                        System.out.println(" \tNo hay cambio");
                    }
                }
            }
        }        //Evaluado a fila y columna 0
        // Recorrido de la matriz de caminos
        for (int a = 0; a < grafos.length; a++) {
            for (int b = 0; b < grafos.length; b++) {
                System.out.println(a + ", " + b + " = " + matrizCaminos[a][b]);
            }
        }
    }

}
