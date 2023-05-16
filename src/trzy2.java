import java.util.Random;

public class trzy2 {
    public static void main(String[] args) {
        int[][] tab = new int[5][5];
        Random random = new Random();
        for (int row = 0; row < tab.length; row++) {
            for (int col = 0; col < tab.length; col++){
                tab[row][col] = random.nextInt(101);
                System.out.print(tab[row][col] + " ");
            }
            System.out.println();
        }
        int min = tab[0][0];
        for (int row = 0; row < tab.length; row++) {
            for (int col = 0; col < tab.length; col++) {
                if (min > tab[row][col]) {
                    min = tab[row][col];
                }
            }
        }
            System.out.println("Najmniejsza liczba w tabliicy to: " + min);
    }
}
