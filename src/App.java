import java.util.Scanner;
import java.util.Random;

public class App {

    public 
    public static void main(String[] args) throws Exception {
    /*     Scanner scan = new Scanner (System.in);
        int opcoes = scan.nextInt()

        switch (opcoes) {
            case 1:

                break;

            default:
                break;
        }*/

        int matriz[][] = new int[][] { { 0, 2, 3 }, { 4, 5, 6 }, { 7, 8, 1 } };

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (matriz[linha][coluna] == 0 && linha == 0) {
                    //if para primeira posição
                    if (coluna == 0) {
                        int dir = matriz[linha][coluna + 1];
                        int baix = matriz[linha + 1][coluna];
                        int sort = new Random().nextInt(0, 2);
                        for (int i = 0; i < matriz.length; i++) {
                            for (int j = 0; j < matriz.length; j++) {
                                if (sort == 0){
                                    matriz[linha][coluna] = dir;
                                    matriz[linha][coluna + 1] = 0;}
                            if(sort ==1){
                                matriz[linha][coluna] = baix;
                                matriz[linha + 1][coluna] =0; 
                            }
                        }}
                        
                    }

                }

                System.out.print(matriz[linha][coluna] + " ");

            }
            System.out.println();
        }
    }
}