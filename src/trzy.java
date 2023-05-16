import java.util.Random;

public class trzy {
    public static void main(String[] args) {
        int[][] tab = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = random.nextInt(101);

                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
