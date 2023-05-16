import java.util.Random;

public class siedem {
    public static void main(String[] args) {
        int tab[] = new int[5];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
            if (i < tab.length - 1) {
                System.out.print(tab[i] + ", ");
            } else {
                System.out.print(tab[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < tab.length / 2; i++) {
            int temp = tab[tab.length - i - 1];
            tab[tab.length - i - 1] = tab[i];
            tab[i] = temp;
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ((i < tab.length - 1) ? ", " : ""));
            }
        }
    }

