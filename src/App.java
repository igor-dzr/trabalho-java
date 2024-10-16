import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        char matriz[][] = new char[][] { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', ' ' } };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[0][0] == ' ') {
                    matriz[2][2]= matriz[2][1];
                    matriz[2][1] = ' ';
                }
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
    }
}