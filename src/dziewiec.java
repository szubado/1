import java.util.Random;

public class dziewiec {
    public static void main(String[] args) {
        int tab[] = new int[5];
        int tab2[] = new int[tab.length];
        int tab3[] = new int[tab.length];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = random.nextInt(10);
            System.out.print(tab2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            tab3[i] = tab[i] + tab2[i];
            System.out.print(tab3[i] + " ");
        }
    }
}
