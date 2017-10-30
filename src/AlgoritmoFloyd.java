public class AlgoritmoFloyd {

    public void calcularRutaMasCorta(int[][] grafos, String[] nodos){
        String[][] matrizCaminos = new String[grafos.length][grafos.length];
        //System.out.println(grafos.length);
        for(int a=0;a<grafos.length;a++){
            for(int b=0;b<grafos.length;b++){
                matrizCaminos[b][a] = nodos[a];
            }
        }
        for(int a=0;a<grafos.length;a++){
            for(int b=0;b<grafos.length;b++){
                System.out.println(a + ", " + b + " = " + matrizCaminos[a][b]);
            }
        }
    }
}
