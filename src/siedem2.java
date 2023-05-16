import java.util.Random;

public class siedem2 {
    public static void main(String[] args) {
        int tab[] = new int[5];
        int tab2[] = new int[5];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = tab[tab.length - 1 -i];
            System.out.print(tab2[i] + " ");

        }
    }

}